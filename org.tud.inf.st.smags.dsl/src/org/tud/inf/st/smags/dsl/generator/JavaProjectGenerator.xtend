/*
 * generated by Xtext 2.10.0
 */
package org.tud.inf.st.smags.dsl.generator

import java.util.ArrayList
import java.util.HashSet
import java.util.Set
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator
import org.tud.inf.st.smags.model.smags.Architecture
import org.tud.inf.st.smags.model.smags.BindOperator
import org.tud.inf.st.smags.model.smags.Component
import org.tud.inf.st.smags.model.smags.ComponentType
import org.tud.inf.st.smags.model.smags.CreateInstanceOperator
import org.tud.inf.st.smags.model.smags.Deployment
import org.tud.inf.st.smags.model.smags.GenericUse
import org.tud.inf.st.smags.model.smags.MetaArchitecture
import org.tud.inf.st.smags.model.smags.Method
import org.tud.inf.st.smags.model.smags.Port
import org.tud.inf.st.smags.model.smags.PortType
import org.tud.inf.st.smags.model.smags.PrimitiveUse
import org.tud.inf.st.smags.model.smags.RoleModel
import org.tud.inf.st.smags.model.smags.SmagsModel
import org.tud.inf.st.smags.model.smags.Type
import org.tud.inf.st.smags.model.smags.TypeUse
import org.tud.inf.st.smags.model.smags.Variable

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JavaProjectGenerator extends AbstractGenerator {

	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		if (context instanceof SmagsGeneratorContext) {
			val project = (context as SmagsGeneratorContext).project;
			val java = project.extendToJava;
			addSoureFolder(java,"src-gen");			
		}

		for (m : resource.contents.filter(SmagsModel)) {
			for (a : m.elements.filter(MetaArchitecture)) {
				generateMetaArchitectureFiles(a, fsa)
			}

			for (a : m.elements.filter(Architecture)) {

				val package = a.pkg;

				fsa.generateFile(package.replaceAll("\\.",'/') + "/" + a.name.toFirstUpper + "Architecture.java", compile(package, a));

				for (c : a.elements.filter(Component)) {
					fsa.generateFile(package.replaceAll("\\.",'/') + "/" + c.name.toFirstUpper + ".java", compile(package, c));
				}

				for (p : a.elements.filter(Port)) {
					fsa.generateFile(package.replaceAll("\\.",'/') + "/" + p.name.toFirstUpper + ".java", compile(package, p));
				}			

				for (d : a.elements.filter(Deployment)) {
					fsa.generateFile(package.replaceAll("\\.",'/') + "/" + d.name.toFirstUpper + ".java", compile(package, d));
				}
			}
		}
	}
	
	protected def void generateMetaArchitectureFiles(MetaArchitecture a, IFileSystemAccess2 fsa) {
		val package = a.pkg;
		val portTypeMarkerName = a.name.toFirstUpper + "PortType";
		
		fsa.generateFile(package.replaceAll("\\.",'/') + "/" + a.name.toFirstUpper + "MetaArchitecture.java", compile(package, a));
		
		fsa.generateFile(package.replaceAll("\\.",'/') + "/" + portTypeMarkerName + ".java", marker(package, portTypeMarkerName));
		
		for (c : a.elements.filter(ComponentType)) {
			fsa.generateFile(package.replaceAll("\\.",'/') + "/" + c.name.toFirstUpper + ".java",
				compile(package, c, portTypeMarkerName));
		}
		
		for (p : a.elements.filter(PortType)) {
			fsa.generateFile(package.replaceAll("\\.",'/') + "/" + p.name.toFirstUpper + ".java",
				compile(package, p, portTypeMarkerName));
		}
	}
	
	protected def pkg(MetaArchitecture a) {
		if(a.namespace==null)
			return a.name.toLowerCase
		else
			return a.namespace;
	}
	
	protected def pkg(Architecture a) {
		if(a.namespace==null)
			return a.name.toLowerCase
		else
			return a.namespace;
	}

	protected def String commaList(Iterable<String> list) {
		val out = new StringBuffer();
		val i = list.iterator;

		while (i.hasNext) {
			out.append(i.next);
			if (i.hasNext) {
				out.append(", ");
			}
		}

		return out.toString;
	}

	protected def Set<Type> usedTypes(PortType p) {
		val used = new HashSet<Type>();
		p.elements.filter(Variable).filter[v | v.type instanceof GenericUse].forEach([v|used.add((v as GenericUse).type)]);
		p.elements.filter(Method).forEach([m|used.addAll(usedTypes(m))]);
		return used;
	}

	protected def Set<Type> usedTypes(Method m) {
		val used = new HashSet<Type>();
		if(m.returnType instanceof GenericUse)
		used.add((m.returnType as GenericUse).type);
		m.args.filter[v | v.type instanceof GenericUse].forEach([v|used.add((v.type as GenericUse).type)]);
		return used;
	}
	
	protected def String binding(Type t, Architecture a) {
		a.typeBindings.findFirst[b|b.type == t].implementation;
	}
	
	protected def String binding(TypeUse t, Architecture a) {
		if(t instanceof GenericUse)
			return binding((t as GenericUse).type,a)
		else 
			return (t as PrimitiveUse).type;
	}

	protected def marker(String pkg, String name) '''
		package �pkg�;
		
		public interface �name�{
			
		}
	'''
	
	protected def compile(TypeUse t) {
		if(t instanceof GenericUse)
		'''T�(t as GenericUse).type.name.toFirstUpper�'''
		else
		(t as PrimitiveUse).type
	}

	protected def compile(Variable v) '''
		�v.type.compile� �v.name�'''

	protected def compileInterface(Method m) '''
		�m.returnType.compile� �m.name�(�m.args.map[a | a.compile.toString].commaList�);
	'''
	
	protected def compileImpl(Method m, Architecture a) '''
		@Override
		public �binding(m.returnType,a)� �m.name�(�m.args.map[e | binding(e.type,a)+ ' '+e.name].commaList�){
			//TODO implement
			�IF !binding(m.returnType,a).equals("void")�return null;�ENDIF�			
		}
	'''
	
	protected def compileDelegate(Method m) '''
		public �m.returnType.compile� �m.name�(�m.args.map[a | a.compile.toString].commaList�){
			Method m = Arrays.stream(�(m.eContainer as PortType).name.toFirstUpper�.class.getMethods()).filter(e -> e.getName().equals("�m.name�")).findFirst().get();
			return (�m.returnType.compile�)delegate(m�IF m.args.size>0�,�m.args.map[a | a.name].commaList��ENDIF�);
		}
	'''

	protected def genericName(MetaArchitecture a) '''�a.name.toFirstUpper�MetaArchitecture�IF a.elements
			.filter(PortType).exists[pt | pt.usedTypes.size>0]�<�a.elements
				.filter(PortType).map[pt | pt.usedTypes].flatten.map[t | "T"+t.name].toSet.commaList�>�ENDIF�'''
				
	protected def genericName(ComponentType c) '''�c.name.toFirstUpper��IF c.provides
				.exists[pt | pt.usedTypes.size>0]�<�c.provides
					.map[pt | pt.usedTypes].flatten.map[t | "T"+t.name].toSet.commaList�>�ENDIF�'''
					
	protected def genericName(PortType p) '''�p.name.toFirstUpper��IF !p.usedTypes.empty�<�p.usedTypes.map[t | "T"+t.name].toSet.commaList�>�ENDIF�'''

	protected def compile(String pkg, MetaArchitecture a) '''
		package �pkg�;
		
		�a.imports�
		
		public �a.modifiers�class �a.genericName� {
			
			�a.attributes�
			
			�a.constructor�
				
			public void registerInstance(String name, Object instance){
				instances.put(name,instance);	
			}
				
			public Object getInstance(String name){
				return instances.get(name);
			}			
			
			�FOR rm:a.elements.filter(RoleModel)�
				public void activate�rm.name.toFirstUpper�(�rm.slots.map[s | s.type.genericName+" "+s.name].commaList�){
					�FOR op:rm.initialization.filter(BindOperator)�
						�op.slot.name�.playRole(create�op.to.name.toFirstUpper�(�op.slot.name�));
					�ENDFOR�	
				}
			�ENDFOR�
						
			�FOR pt:a.elements.filter(PortType)�
			�pt.factoryMethod�
			�ENDFOR�			
		}
	'''
	
	protected def modifiers(MetaArchitecture a) '''abstract '''
	
	protected def imports(MetaArchitecture a) '''
		import java.util.HashMap;
		import java.util.Map;	
	'''
	
	protected def constructor(MetaArchitecture a) ''''''	
	
	protected def attributes(MetaArchitecture a) '''
		private Map<String,Object> instances = new HashMap<String,Object>();
	'''		
	
	protected def factoryMethod(PortType pt) '''
		public abstract �pt.genericName� create�pt.name.toFirstUpper�(�pt.genericName� base);
	'''

	protected def compile(String pkg, ComponentType c, String portTypeMarker) '''
		package �pkg�;
		
		import java.util.Stack;
		import java.lang.reflect.Method;
		�IF c.provides.size>0�import java.util.Arrays;�ENDIF�
		
		public abstract class �c.genericName� �IF !c.provides.empty�implements �c.provides.
					map[pt | pt.genericName+""].commaList��ENDIF�{
				
			private Stack<�portTypeMarker�> roles = new Stack<�portTypeMarker�>();
			
			public void playRole(�portTypeMarker� p){
				roles.push(p);	
			}
			
			public void dropRole(Class<�portTypeMarker�> c) {
				for(int i=0;i<roles.size();i++) {
					if(c.isAssignableFrom(roles.get(i).getClass())){
						roles.remove(i);
						break;	
					} 	
				}
			}
			
			private Object delegate(Method m, Object... args) {
				Class<?> c = m.getDeclaringClass();
				�portTypeMarker� o = null; 
				for(int i=0;i<roles.size();i++) {
					if(c.isAssignableFrom(roles.get(i).getClass())){
				     	o=roles.get(i);
						break;	
					} 	
				}
				if(o == null)
					throw new UnsupportedOperationException("role "+c+" not bound to "+this);
				else
					try{
						return m.invoke(o,args);
					} catch(Exception e) {
						throw new RuntimeException(e);	
					} 
			}
			
			�FOR m : c.provides.map[pt | pt.elements.filter(Method)].flatten�
				�m.compileDelegate�
			�ENDFOR�
		}
	'''

	protected def compile(String pkg, PortType p,
		String portTypeMarker) '''
		package �pkg�;
		
		public interface �p.genericName� extends �portTypeMarker�{
			�FOR m : p.elements.filter(Method)�
				�m.compileInterface�
			�ENDFOR�
		}
	'''
	
	protected def boundParentName(Architecture a) '''�a.type.name.toFirstUpper�MetaArchitecture�IF a.type.elements
			.filter(PortType).exists[pt | pt.usedTypes.size>0]�<�a.type.elements
				.filter(PortType).map[pt | pt.usedTypes].flatten.map[t | binding(t,a)]
				.toSet.commaList�>�ENDIF�'''
					
	protected def boundParentName(Component c) '''�c.type.name.toFirstUpper��IF c.type.provides
				.exists[pt | pt.usedTypes.size>0]�<�c.type.provides
					.map[pt | pt.usedTypes].flatten.toSet
					.map[t | binding(t,c.eContainer as Architecture)]
					.commaList�>�ENDIF�'''
	
	protected def boundParentName(Port p) '''�p.type.name.toFirstUpper��IF p.type.usedTypes.size>0�<�p.type.usedTypes
				.map[t | binding(t,p.eContainer as Architecture)].commaList�>�ENDIF�'''

	protected def compile(String pkg, Architecture a) '''
		package �pkg�;
		
		import �a.type.pkg�.�a.type.name.toFirstUpper�MetaArchitecture;
		�FOR p:a.elements.filter(Port)�
		import �a.type.pkg�.�p.type.name.toFirstUpper�;
		�ENDFOR�
		
		public class �a.name.toFirstUpper�Architecture extends �a.boundParentName�{	
			
			�FOR p:a.elements.filter(Port)�
			@Override
			public �p.name.toFirstUpper� create�p.type.name.toFirstUpper�(�p.boundParentName� base){
				return new �p.name.toFirstUpper�(base);
			}
			�ENDFOR�	
		}
	'''
	
	protected def compile(String pkg, Component c) '''
		package �pkg�;
		
		import �(c.type.eContainer as MetaArchitecture).pkg�.�c.type.name.toFirstUpper�;
		
		public class �c.name.toFirstUpper� extends �c.boundParentName�{
			
		}
	'''

	protected def compile(String pkg, Port p) '''
		package �pkg�;
		
		import �(p.type.eContainer as MetaArchitecture).pkg�.�p.type.name.toFirstUpper�;
		
		public class �p.name.toFirstUpper� implements �p.boundParentName�{
				
			protected �p.boundParentName� base;
					
			public  �p.name.toFirstUpper�(�p.boundParentName� base){
				this.base = base;				
			}
			
			�FOR m : p.type.elements.filter(Method)�
				�m.compileImpl(p.eContainer as Architecture)�
			�ENDFOR�			
		}
	'''
	
	protected def compile(String pkg, Deployment d)'''
		package �pkg�;
			
		public class �d.name.toFirstUpper�{
			
			public void runScript(�(d.eContainer as Architecture).name.toFirstUpper�Architecture architecture) {
				�FOR op:d.script�
				�IF op instanceof CreateInstanceOperator��(op as CreateInstanceOperator).compile��ENDIF�
				�IF op instanceof ActivateRoleModelOperator��(op as ActivateRoleModelOperator).compile��ENDIF�
				�ENDFOR�				
			}
			
			public static void main(String[] args) {
				�(d.eContainer as Architecture).name.toFirstUpper�Architecture architecture = new �(d.eContainer as Architecture).name.toFirstUpper�Architecture();
				new �d.name.toFirstUpper�().runScript(architecture);
			}
		}
	'''
	
	protected def compile(CreateInstanceOperator o) '''
		architecture.registerInstance("�o.instance.name�",new �o.instance.type.name.toFirstUpper�());
	'''
	
	protected def compile(ActivateRoleModelOperator o) '''
		architecture.activate�o.roleModel.name
			.toFirstUpper�(�o.args.map[ci | '('+ci.type.name.toFirstUpper+')architecture.getInstance("'+ci.name+'")'].commaList�);
	'''
	
	protected def addNature(IProject project, String nature){
		val description = project.getDescription();
		val natures = newArrayList(description.natureIds);
		natures.add(nature);
		description.natureIds = natures;
		project.setDescription(description, new NullProgressMonitor);
	}
	
	protected def extendToJava(IProject project) {
		addNature(project, JavaCore.NATURE_ID);

		val javaProject = JavaCore.create(project);
		val binFolder = project.getFolder("bin");
		if(!binFolder.exists)
			binFolder.create(false, true, null);
		javaProject.setOutputLocation(binFolder.getFullPath(), null);

		val entries = new ArrayList<IClasspathEntry>();
		val vmInstall = JavaRuntime.getDefaultVMInstall();
		val locations = JavaRuntime.getLibraryLocations(vmInstall);
		for (element : locations) {
			entries.add(JavaCore.newLibraryEntry(element.getSystemLibraryPath(), null, null));
		}

		javaProject.setRawClasspath(entries.toArray(newArrayOfSize(entries.size())), new NullProgressMonitor);
		
		return javaProject;
	}
	
	protected def addSoureFolder(IJavaProject javaProject, String path){
		val sourceFolder = javaProject.project.getFolder(path);
		if(!sourceFolder.exists)
			sourceFolder.create(false, true, null);
		
		val root = javaProject.getPackageFragmentRoot(sourceFolder);
		val oldEntries = javaProject.getRawClasspath();
		val newEntries = <IClasspathEntry>newArrayOfSize(oldEntries.length + 1);
		System.arraycopy(oldEntries, 0, newEntries, 0, oldEntries.length);
		newEntries.set(oldEntries.length, JavaCore.newSourceEntry(root.getPath()));
		javaProject.setRawClasspath(newEntries, null);
	}

	protected def createProject(String name) {
		val project = ResourcesPlugin.workspace.root.getProject(name);
		if (!project.exists)
			project.create(new NullProgressMonitor);
		project.open(new NullProgressMonitor);
		return project;
	}
}
