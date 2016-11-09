/*
 * generated by Xtext 2.10.0
 */
package org.tud.inf.st.smags.dsl.generator

import java.util.ArrayList
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.core.IAccessRule
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.core.plugin.PluginRegistry
import org.eclipse.pde.core.project.IBundleProjectService
import org.eclipse.pde.internal.core.ClasspathComputer
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.osgi.framework.Version
import org.tud.inf.st.smags.dsl.Activator
import org.tud.inf.st.smags.model.smags.Architecture
import org.tud.inf.st.smags.model.smags.ArchitectureElement
import org.tud.inf.st.smags.model.smags.Component
import org.tud.inf.st.smags.model.smags.Deployment
import org.tud.inf.st.smags.model.smags.MetaArchitecture
import org.tud.inf.st.smags.model.smags.Port
import org.tud.inf.st.smags.model.smags.PortType
import org.tud.inf.st.smags.model.smags.SmagsModel
import org.tud.inf.st.smags.model.smags.CreateInstanceOperator
import org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class EquinoxGenerator extends JavaProjectGenerator {

	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		if(fsa instanceof EclipseResourceFileSystemAccess2) doGenerate(resource,
			fsa as EclipseResourceFileSystemAccess2, context);
	}

	protected def doGenerate(Resource resource, EclipseResourceFileSystemAccess2 fsa, IGeneratorContext context) {

		for (m : resource.contents.filter(SmagsModel)) {
			for (a : m.elements.filter(Architecture)) {
				val allDeps = newArrayList(a.type.pkg);

				val archDeps = newArrayList(a.type.pkg, "org.eclipse.osgi");

				for (p : a.elements.filter(Port)) {
					archDeps.add(p.pkg);
					allDeps.add(p.pkg);

					val project = p.pkg.createProject;
					fsa.project = project;
					addSoureFolder(project.extendToJava, "src-gen");

					fsa.outputPath = ".";
					fsa.generateFile("build.properties", buildProperties);
					project.extendToPlugin(#{p.pkg}, p.pkg + '.' + p.name.toFirstUpper + 'Activator', a.type.pkg,
						"org.eclipse.osgi");

					fsa.outputPath = "src-gen";
					fsa.generateFile(p.pkg.replaceAll("\\.", "/") + '/' + p.name.toFirstUpper + "Activator.java",
						p.activator);

					fsa.generateFile(p.pkg.replaceAll("\\.", '/') + "/" + p.name.toFirstUpper + ".java",
						compile(p.pkg, p));
				}

				for (c : a.elements.filter(Component)) {
					archDeps.add(c.pkg);
					allDeps.add(c.pkg);

					val project = c.pkg.createProject;
					fsa.project = project;
					addSoureFolder(project.extendToJava, "src-gen");

					fsa.outputPath = ".";
					fsa.generateFile("build.properties", buildProperties);
					project.extendToPlugin(#{c.pkg}, a.pkg + "." + c.name.toFirstUpper + 'Activator', a.type.pkg,
						"org.eclipse.osgi");

					fsa.outputPath = "src-gen";
					fsa.generateFile(c.pkg.replaceAll("\\.", "/") + '/' + c.name.toFirstUpper + "Activator.java",
						c.activator);

					fsa.generateFile(c.pkg.replaceAll("\\.", '/') + "/" + c.name.toFirstUpper + ".java",
						compile(c.pkg, c));
				}

				// generate architecture plugin
				allDeps.add(a.pkg);

				val project = a.pkg.createProject;
				val jproject = project.extendToJava;
				fsa.project = project;
				addSoureFolder(jproject, "src-gen");

				fsa.outputPath = ".";
				fsa.generateFile("build.properties", buildProperties);
				project.extendToPlugin(#{a.pkg}, a.pkg + "." + a.name.toFirstUpper + "ArchitectureActivator", archDeps);

				for (d : a.elements.filter(Deployment)) {
					fsa.generateFile(d.name.toFirstUpper + '.launch', d.compileLaunchConfig(allDeps));
				}

				// jproject.publishAllLibs
				fsa.outputPath = "src-gen";
				fsa.generateFile(
					a.pkg.replaceAll("\\.", "/") + '/' + a.name.toFirstUpper + "ArchitectureActivator.java",
					a.activator);

					fsa.generateFile(a.pkg.replaceAll("\\.", '/') + "/" + a.name.toFirstUpper + "Architecture.java",
						compile(a.pkg, a));

					for (d : a.elements.filter(Deployment)) {
						fsa.generateFile(a.pkg.replaceAll("\\.", '/') + "/" + d.name.toFirstUpper + '.java',
							compile(a.pkg, d));
					}
				}
			}

		}

		protected def extendToPlugin(IProject project, String[] exported, String activatorClassName,
			String... deps) throws CoreException {
			addNature(project, "org.eclipse.pde.PluginNature");

			val monitor = new NullProgressMonitor();

			val context = Activator.getDefault().getContext();

			val bundleProjectServiceRef = context.getServiceReference(typeof(IBundleProjectService));
			val bps = context.getService(bundleProjectServiceRef);

			val bpd = bps.getDescription(project);

			val requiredStrs = newArrayList(deps);

			val required = requiredStrs.map[s|bps.newRequiredBundle(s, null, false, false)];

			bpd.setRequiredBundles(required);

			bpd.setSymbolicName(project.getName());
			bpd.setBundleVersion(new Version("0.1"));

			bpd.activator = activatorClassName;

			bpd.packageExports = exported.map[ex|bps.newPackageExport(ex, null, true, null)]

			bpd.apply(monitor);

			val model = PluginRegistry.findModel(project);
			ClasspathComputer.setClasspath(project, model);
		}

		protected def publishAllLibs(IJavaProject jproject) { // TODO use
			val classPath = jproject.rawClasspath;

			val entries = new ArrayList<IClasspathEntry>();
			for (element : classPath) {
				entries.add(
					JavaCore.newLibraryEntry(element.path, null, null,
						#{JavaCore.newAccessRule(new Path("**"), IAccessRule.K_ACCESSIBLE)}, null, true));
			}

			jproject.setRawClasspath(entries.toArray(newArrayOfSize(entries.size())), new NullProgressMonitor);

			return jproject;
		}

		protected def pkg(ArchitectureElement e) {
			return (e.eContainer as Architecture).pkg + '.' + e.name.toLowerCase
		}

		protected def buildProperties() '''
			source.. = src-gen/
			output.. = bin/
			bin.includes = META-INF/,\
			               .
		'''

		protected def activator(MetaArchitecture a) '''
			package �a.pkg�;
			
			import org.osgi.framework.BundleActivator;
			import org.osgi.framework.BundleContext;
			import org.osgi.framework.ServiceReference;
				
			public class �a.name.toFirstUpper�Activator implements BundleActivator{
				private ServiceReference<?> serviceRef;				
				
				public void start(BundleContext context) throws Exception {
					serviceRef = context.registerService(�a.name.toFirstUpper�MetaArchitecture.class.getName(),
							new �a.name.toFirstUpper�MetaArchitecture(context),null).getReference();
				}
				
				public void stop(BundleContext context) throws Exception {
					context.ungetService(serviceRef);				
				}			
			}		
		'''

		override protected def attributes(MetaArchitecture a) '''
			�super.attributes(a)�
			private BundleContext ctx;
		'''

		override protected def constructor(MetaArchitecture a) '''
			public �a.name.toFirstUpper�MetaArchitecture(BundleContext ctx){
				this.ctx = ctx;				
			}
		'''

		override protected def imports(MetaArchitecture a) '''
			import java.util.HashMap;			
			import java.util.Map;			
			import org.osgi.framework.BundleContext;			
			import org.osgi.framework.ServiceReference;			
		'''

		override protected def factoryMethod(PortType pt) '''
			public �pt.genericName� create�pt.name.toFirstUpper�(�pt.genericName� base){
				ServiceReference<?> r = ctx.getServiceReference(�pt.genericName�.class);
				Class<?> c = (Class<?>) ctx.getService(r);
				try {
					return (�pt.genericName�) c.getConstructor(�pt.genericName�.class).newInstance(base);
				} catch (Exception e) {
					e.printStackTrace();
					return null;
				}
			}		
				
		'''

		override protected def modifiers(MetaArchitecture a) ''''''

		protected def activator(Port p) '''
			package �p.pkg�;
			
			import org.osgi.framework.BundleActivator;
			import org.osgi.framework.BundleContext;
			import org.osgi.framework.ServiceReference;
			
			public class �p.name.toFirstUpper�Activator implements BundleActivator{
				private ServiceReference<?> serviceRef;
				
				public void start(BundleContext context) throws Exception {
					serviceRef = context.registerService(�(p.eContainer as Architecture).type.pkg+'.'
					+p.type.name.toFirstUpper�.class.getName(),
						�p.name.toFirstUpper�.class,null).getReference();
				}
				
				public void stop(BundleContext context) throws Exception {
					context.ungetService(serviceRef);				
				}			
			}		
		'''

		protected def activator(Component c) '''
			package �c.pkg�;
			
			import org.osgi.framework.BundleActivator;
			import org.osgi.framework.BundleContext;
			import org.osgi.framework.ServiceReference;
			
			public class �c.name.toFirstUpper�Activator implements BundleActivator{
				private ServiceReference<?> serviceRef;
				
				public void start(BundleContext context) throws Exception {
					serviceRef = context.registerService(�(c.eContainer as Architecture).type.pkg+'.'
					+c.type.name.toFirstUpper�.class.getName(),
						�c.name.toFirstUpper�.class,null).getReference();
				}
				
				public void stop(BundleContext context) throws Exception {
					context.ungetService(serviceRef);				
				}			
			}		
		'''

		protected def activator(Architecture a) '''
			package �a.pkg�;
			
			import org.osgi.framework.BundleActivator;
			import org.osgi.framework.BundleContext;
			
			public class �a.name.toFirstUpper�ArchitectureActivator implements BundleActivator{
				public void start(BundleContext context) throws Exception {
					
				}
				
				public void stop(BundleContext context) throws Exception {
					
				}			
			}		
		'''

		override protected def compile(String pkg, Architecture a) '''
			package �pkg�;
			
			import �a.type.pkg�.�a.type.name.toFirstUpper�MetaArchitecture;
			import org.osgi.framework.BundleContext;
			
			public class �a.name.toFirstUpper�Architecture extends �a.boundParentName�{	
				public  �a.name.toFirstUpper�Architecture(BundleContext ctx) {
					super(ctx);
				}	
			}		
		'''

		override protected def compile(String pkg, Deployment d) '''
			package �pkg�;
				
			public class �d.name.toFirstUpper�{
				
				public void runScript(�(d.eContainer as Architecture).name.toFirstUpper�Architecture architecture) {
					�FOR op : d.script�
						�IF op instanceof CreateInstanceOperator��(op as CreateInstanceOperator).compile��ENDIF�
						�IF op instanceof ActivateRoleModelOperator��(op as ActivateRoleModelOperator).compile��ENDIF�
					�ENDFOR�				
				}
			}		
		'''

		protected def compileLaunchConfig(Deployment d, String... plugins) '''
			<?xml version="1.0" encoding="UTF-8" standalone="no"?>
			<launchConfiguration type="org.eclipse.pde.ui.EquinoxLauncher">
				<booleanAttribute key="append.args" value="true" />
				<booleanAttribute key="automaticAdd" value="true" />
				<booleanAttribute key="automaticValidate" value="false" />
				<stringAttribute key="bootstrap" value="" />
				<stringAttribute key="checked" value="[NONE]" />
				<booleanAttribute key="clearConfig" value="false" />
				<stringAttribute key="configLocation"
					value="${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/StartupEquinox" />
				<booleanAttribute key="default" value="true" />
				<booleanAttribute key="default_auto_start" value="true" />
				<intAttribute key="default_start_level" value="4" />
				<booleanAttribute key="includeOptional" value="true" />
				<booleanAttribute
					key="org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD" value="true" />
				<stringAttribute key="org.eclipse.jdt.launching.JRE_CONTAINER"
					value="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8" />
				<stringAttribute key="org.eclipse.jdt.launching.PROGRAM_ARGUMENTS"
					value="-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog -console" />
				<stringAttribute key="org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER"
					value="org.eclipse.pde.ui.workbenchClasspathProvider" />
				<stringAttribute key="org.eclipse.jdt.launching.VM_ARGUMENTS"
					value="-Declipse.ignoreApp=true -Dosgi.noShutdown=true -Dsmags.deployment=�d.name.toFirstUpper�" />
				<stringAttribute key="pde.version" value="3.3" />
				<booleanAttribute key="show_selected_only" value="false" />
				<stringAttribute key="target_bundles"
					value="com.ibm.icu@default:default,javax.inject@default:default,javax.servlet*3.1.0.v201410161800@default:default,javax.xml@default:default,org.apache.batik.css*1.7.0.v201011041433@default:default,org.apache.batik.util*1.7.0.v201011041433@default:default,org.apache.batik.util.gui*1.7.0.v200903091627@default:default,org.apache.commons.jxpath@default:default,org.eclipse.ant.core@default:default,org.eclipse.compare.core@default:default,org.eclipse.core.commands@default:default,org.eclipse.core.contenttype@default:default,org.eclipse.core.databinding.observable@default:default,org.eclipse.core.databinding.property@default:default,org.eclipse.core.databinding@default:default,org.eclipse.core.expressions@default:default,org.eclipse.core.filesystem.win32.x86_64@default:false,org.eclipse.core.filesystem@default:default,org.eclipse.core.jobs@default:default,org.eclipse.core.resources.win32.x86_64@default:false,org.eclipse.core.resources@default:default,org.eclipse.core.runtime@default:true,org.eclipse.core.variables@default:default,org.eclipse.e4.core.commands@default:default,org.eclipse.e4.core.contexts@default:default,org.eclipse.e4.core.di.annotations@default:default,org.eclipse.e4.core.di.extensions@default:default,org.eclipse.e4.core.di@default:default,org.eclipse.e4.core.services@default:default,org.eclipse.e4.emf.xpath@default:default,org.eclipse.e4.ui.bindings@default:default,org.eclipse.e4.ui.css.core@default:default,org.eclipse.e4.ui.css.swt.theme@default:default,org.eclipse.e4.ui.css.swt@default:default,org.eclipse.e4.ui.di@default:default,org.eclipse.e4.ui.model.workbench@default:default,org.eclipse.e4.ui.services@default:default,org.eclipse.e4.ui.widgets@default:default,org.eclipse.e4.ui.workbench.addons.swt@default:default,org.eclipse.e4.ui.workbench.renderers.swt@default:default,org.eclipse.e4.ui.workbench.swt@default:default,org.eclipse.e4.ui.workbench3@default:default,org.eclipse.e4.ui.workbench@default:default,org.eclipse.emf.common@default:default,org.eclipse.emf.ecore.change@default:default,org.eclipse.emf.ecore.xmi@default:default,org.eclipse.emf.ecore@default:default,org.eclipse.equinox.app@default:default,org.eclipse.equinox.bidi@default:default,org.eclipse.equinox.common@2:true,org.eclipse.equinox.event@default:default,org.eclipse.equinox.preferences@default:default,org.eclipse.equinox.registry@default:default,org.eclipse.help@default:default,org.eclipse.jface.databinding@default:default,org.eclipse.jface@default:default,org.eclipse.osgi.compatibility.state@default:false,org.eclipse.osgi.services@default:default,org.eclipse.osgi@-1:true,org.eclipse.swt.win32.win32.x86_64@default:false,org.eclipse.swt@default:default,org.eclipse.team.core@default:default,org.eclipse.ui.trace@default:default,org.eclipse.ui.workbench@default:default,org.eclipse.ui@default:default,org.w3c.css.sac@default:default,org.w3c.dom.events@default:default,org.w3c.dom.smil@default:default,org.w3c.dom.svg@default:default" />
				<booleanAttribute key="tracing" value="false" />
				<booleanAttribute key="useCustomFeatures" value="false" />
				<booleanAttribute key="useDefaultConfigArea" value="true" />
				<stringAttribute key="workspace_bundles"
					value="�plugins.map[p | p+'@default:default'].commaList�" />
			</launchConfiguration>			
		'''
	}
	