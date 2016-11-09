/**
 * generated by Xtext 2.10.0
 */
package org.tud.inf.st.smags.dsl.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IBundleProjectService;
import org.eclipse.pde.core.project.IPackageExportDescription;
import org.eclipse.pde.core.project.IRequiredBundleDescription;
import org.eclipse.pde.internal.core.ClasspathComputer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.Version;
import org.tud.inf.st.smags.dsl.Activator;
import org.tud.inf.st.smags.dsl.generator.JavaProjectGenerator;
import org.tud.inf.st.smags.model.smags.ActivateRoleModelOperator;
import org.tud.inf.st.smags.model.smags.Architecture;
import org.tud.inf.st.smags.model.smags.ArchitectureElement;
import org.tud.inf.st.smags.model.smags.Component;
import org.tud.inf.st.smags.model.smags.ComponentType;
import org.tud.inf.st.smags.model.smags.CreateInstanceOperator;
import org.tud.inf.st.smags.model.smags.Deployment;
import org.tud.inf.st.smags.model.smags.DeploymentOperator;
import org.tud.inf.st.smags.model.smags.MetaArchitecture;
import org.tud.inf.st.smags.model.smags.Port;
import org.tud.inf.st.smags.model.smags.PortType;
import org.tud.inf.st.smags.model.smags.SmagsElement;
import org.tud.inf.st.smags.model.smags.SmagsModel;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EquinoxMetaGenerator extends JavaProjectGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    if ((fsa instanceof EclipseResourceFileSystemAccess2)) {
      this.doGenerate(resource, 
        ((EclipseResourceFileSystemAccess2) fsa), context);
    }
  }
  
  protected void doGenerate(final Resource resource, final EclipseResourceFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EList<EObject> _contents = resource.getContents();
      Iterable<SmagsModel> _filter = Iterables.<SmagsModel>filter(_contents, SmagsModel.class);
      for (final SmagsModel m : _filter) {
        EList<SmagsElement> _elements = m.getElements();
        Iterable<MetaArchitecture> _filter_1 = Iterables.<MetaArchitecture>filter(_elements, MetaArchitecture.class);
        for (final MetaArchitecture a : _filter_1) {
          {
            String _pkg = this.pkg(a);
            final IProject project = this.createProject(_pkg);
            fsa.setProject(project);
            IJavaProject _extendToJava = this.extendToJava(project);
            this.addSoureFolder(_extendToJava, "src-gen");
            fsa.setOutputPath(".");
            CharSequence _buildProperties = this.buildProperties();
            fsa.generateFile("build.properties", _buildProperties);
            String _pkg_1 = this.pkg(a);
            String _pkg_2 = this.pkg(a);
            String _plus = (_pkg_2 + ".");
            String _name = a.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            String _plus_1 = (_plus + _firstUpper);
            String _plus_2 = (_plus_1 + "Activator");
            this.extendToPlugin(project, ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet(_pkg_1)), String.class)), _plus_2, "org.eclipse.osgi");
            fsa.setOutputPath("src-gen");
            String _pkg_3 = this.pkg(a);
            String _replaceAll = _pkg_3.replaceAll("\\.", "/");
            String _plus_3 = (_replaceAll + "/");
            String _name_1 = a.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
            String _plus_4 = (_plus_3 + _firstUpper_1);
            String _plus_5 = (_plus_4 + "Activator.java");
            CharSequence _activator = this.activator(a);
            fsa.generateFile(_plus_5, _activator);
            this.generateMetaArchitectureFiles(a, fsa);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected void extendToPlugin(final IProject project, final String[] exported, final String activatorClassName, final String... deps) throws CoreException {
    this.addNature(project, "org.eclipse.pde.PluginNature");
    final NullProgressMonitor monitor = new NullProgressMonitor();
    Activator _default = Activator.getDefault();
    final BundleContext context = _default.getContext();
    final ServiceReference<IBundleProjectService> bundleProjectServiceRef = context.<IBundleProjectService>getServiceReference(IBundleProjectService.class);
    final IBundleProjectService bps = context.<IBundleProjectService>getService(bundleProjectServiceRef);
    final IBundleProjectDescription bpd = bps.getDescription(project);
    final ArrayList<String> requiredStrs = CollectionLiterals.<String>newArrayList(deps);
    final Function1<String, IRequiredBundleDescription> _function = (String s) -> {
      return bps.newRequiredBundle(s, null, false, false);
    };
    final List<IRequiredBundleDescription> required = ListExtensions.<String, IRequiredBundleDescription>map(requiredStrs, _function);
    bpd.setRequiredBundles(((IRequiredBundleDescription[])Conversions.unwrapArray(required, IRequiredBundleDescription.class)));
    String _name = project.getName();
    bpd.setSymbolicName(_name);
    Version _version = new Version("0.1");
    bpd.setBundleVersion(_version);
    bpd.setActivator(activatorClassName);
    final Function1<String, IPackageExportDescription> _function_1 = (String ex) -> {
      return bps.newPackageExport(ex, null, true, null);
    };
    List<IPackageExportDescription> _map = ListExtensions.<String, IPackageExportDescription>map(((List<String>)Conversions.doWrapArray(exported)), _function_1);
    bpd.setPackageExports(((IPackageExportDescription[])Conversions.unwrapArray(_map, IPackageExportDescription.class)));
    bpd.apply(monitor);
    final IPluginModelBase model = PluginRegistry.findModel(project);
    ClasspathComputer.setClasspath(project, model);
  }
  
  protected IJavaProject publishAllLibs(final IJavaProject jproject) {
    try {
      final IClasspathEntry[] classPath = jproject.getRawClasspath();
      final ArrayList<IClasspathEntry> entries = new ArrayList<IClasspathEntry>();
      for (final IClasspathEntry element : classPath) {
        IPath _path = element.getPath();
        Path _path_1 = new Path("**");
        IAccessRule _newAccessRule = JavaCore.newAccessRule(_path_1, IAccessRule.K_ACCESSIBLE);
        IClasspathEntry _newLibraryEntry = JavaCore.newLibraryEntry(_path, null, null, 
          ((IAccessRule[])Conversions.unwrapArray(Collections.<IAccessRule>unmodifiableSet(CollectionLiterals.<IAccessRule>newHashSet(_newAccessRule)), IAccessRule.class)), null, true);
        entries.add(_newLibraryEntry);
      }
      int _size = entries.size();
      IClasspathEntry[] _newArrayOfSize = new IClasspathEntry[_size];
      IClasspathEntry[] _array = entries.<IClasspathEntry>toArray(_newArrayOfSize);
      NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
      jproject.setRawClasspath(_array, _nullProgressMonitor);
      return jproject;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String pkg(final ArchitectureElement e) {
    EObject _eContainer = e.eContainer();
    String _pkg = this.pkg(((Architecture) _eContainer));
    String _plus = (_pkg + ".");
    String _name = e.getName();
    String _lowerCase = _name.toLowerCase();
    return (_plus + _lowerCase);
  }
  
  protected CharSequence buildProperties() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("source.. = src-gen/");
    _builder.newLine();
    _builder.append("output.. = bin/");
    _builder.newLine();
    _builder.append("bin.includes = META-INF/,\\");
    _builder.newLine();
    _builder.append("               ");
    _builder.append(".");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence activator(final MetaArchitecture a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _pkg = this.pkg(a);
    _builder.append(_pkg, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleActivator;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleContext;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.ServiceReference;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class ");
    String _name = a.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Activator implements BundleActivator{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ServiceReference<?> serviceRef;\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("serviceRef = context.registerService(");
    String _name_1 = a.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t\t");
    _builder.append("MetaArchitecture.class.getName(),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.append("new ");
    String _name_2 = a.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t\t\t\t");
    _builder.append("MetaArchitecture(context),null).getReference();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void stop(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("context.ungetService(serviceRef);\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence attributes(final MetaArchitecture a) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _attributes = super.attributes(a);
    _builder.append(_attributes, "");
    _builder.newLineIfNotEmpty();
    _builder.append("private BundleContext ctx;");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence constructor(final MetaArchitecture a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    String _name = a.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("MetaArchitecture(BundleContext ctx){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("this.ctx = ctx;\t\t\t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence imports(final MetaArchitecture a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.HashMap;\t\t\t");
    _builder.newLine();
    _builder.append("import java.util.Map;\t\t\t");
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleContext;\t\t\t");
    _builder.newLine();
    _builder.append("import org.osgi.framework.ServiceReference;\t\t\t");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence factoryMethod(final PortType pt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ");
    CharSequence _genericName = this.genericName(pt);
    _builder.append(_genericName, "");
    _builder.append(" create");
    String _name = pt.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("(");
    CharSequence _genericName_1 = this.genericName(pt);
    _builder.append(_genericName_1, "");
    _builder.append(" base){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ServiceReference<?> r = ctx.getServiceReference(");
    CharSequence _genericName_2 = this.genericName(pt);
    _builder.append(_genericName_2, "\t");
    _builder.append(".class);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Class<?> c = (Class<?>) ctx.getService(r);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return (");
    CharSequence _genericName_3 = this.genericName(pt);
    _builder.append(_genericName_3, "\t\t");
    _builder.append(") c.getConstructor(");
    CharSequence _genericName_4 = this.genericName(pt);
    _builder.append(_genericName_4, "\t\t");
    _builder.append(".class).newInstance(base);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("} catch (Exception e) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence modifiers(final MetaArchitecture a) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence activator(final Port p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _pkg = this.pkg(p);
    _builder.append(_pkg, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleActivator;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleContext;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.ServiceReference;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = p.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Activator implements BundleActivator{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ServiceReference<?> serviceRef;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("serviceRef = context.registerService(");
    EObject _eContainer = p.eContainer();
    MetaArchitecture _type = ((Architecture) _eContainer).getType();
    String _pkg_1 = this.pkg(_type);
    String _plus = (_pkg_1 + ".");
    PortType _type_1 = p.getType();
    String _name_1 = _type_1.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    String _plus_1 = (_plus + _firstUpper_1);
    _builder.append(_plus_1, "\t\t");
    _builder.append(".class.getName(),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _name_2 = p.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t\t\t");
    _builder.append(".class,null).getReference();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void stop(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("context.ungetService(serviceRef);\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence activator(final Component c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _pkg = this.pkg(c);
    _builder.append(_pkg, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleActivator;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleContext;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.ServiceReference;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = c.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("Activator implements BundleActivator{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("private ServiceReference<?> serviceRef;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void start(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("serviceRef = context.registerService(");
    EObject _eContainer = c.eContainer();
    MetaArchitecture _type = ((Architecture) _eContainer).getType();
    String _pkg_1 = this.pkg(_type);
    String _plus = (_pkg_1 + ".");
    ComponentType _type_1 = c.getType();
    String _name_1 = _type_1.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    String _plus_1 = (_plus + _firstUpper_1);
    _builder.append(_plus_1, "\t\t");
    _builder.append(".class.getName(),");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    String _name_2 = c.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t\t\t");
    _builder.append(".class,null).getReference();");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void stop(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("context.ungetService(serviceRef);\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence activator(final Architecture a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _pkg = this.pkg(a);
    _builder.append(_pkg, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleActivator;");
    _builder.newLine();
    _builder.append("import org.osgi.framework.BundleContext;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = a.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("ArchitectureActivator implements BundleActivator{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public void start(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void stop(BundleContext context) throws Exception {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t\t\t");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence compile(final String pkg, final Architecture a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(pkg, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import ");
    MetaArchitecture _type = a.getType();
    String _pkg = this.pkg(_type);
    _builder.append(_pkg, "");
    _builder.append(".");
    MetaArchitecture _type_1 = a.getType();
    String _name = _type_1.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("MetaArchitecture;");
    _builder.newLineIfNotEmpty();
    _builder.append("import org.osgi.framework.BundleContext;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name_1 = a.getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "");
    _builder.append("Architecture extends ");
    CharSequence _boundParentName = this.boundParentName(a);
    _builder.append(_boundParentName, "");
    _builder.append("{\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public  ");
    String _name_2 = a.getName();
    String _firstUpper_2 = StringExtensions.toFirstUpper(_name_2);
    _builder.append(_firstUpper_2, "\t");
    _builder.append("Architecture(BundleContext ctx) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(ctx);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  @Override
  protected CharSequence compile(final String pkg, final Deployment d) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(pkg, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("public class ");
    String _name = d.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void runScript(");
    EObject _eContainer = d.eContainer();
    String _name_1 = ((Architecture) _eContainer).getName();
    String _firstUpper_1 = StringExtensions.toFirstUpper(_name_1);
    _builder.append(_firstUpper_1, "\t");
    _builder.append("Architecture architecture) {");
    _builder.newLineIfNotEmpty();
    {
      EList<DeploymentOperator> _script = d.getScript();
      for(final DeploymentOperator op : _script) {
        _builder.append("\t\t");
        {
          if ((op instanceof CreateInstanceOperator)) {
            CharSequence _compile = this.compile(((CreateInstanceOperator) op));
            _builder.append(_compile, "\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        {
          if ((op instanceof ActivateRoleModelOperator)) {
            CharSequence _compile_1 = this.compile(((ActivateRoleModelOperator) op));
            _builder.append(_compile_1, "\t\t");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}\t\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence compileLaunchConfig(final Deployment d, final String... plugins) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
    _builder.newLine();
    _builder.append("<launchConfiguration type=\"org.eclipse.pde.ui.EquinoxLauncher\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"append.args\" value=\"true\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"automaticAdd\" value=\"true\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"automaticValidate\" value=\"false\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"bootstrap\" value=\"\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"checked\" value=\"[NONE]\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"clearConfig\" value=\"false\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"configLocation\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/StartupEquinox\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"default\" value=\"true\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"default_auto_start\" value=\"true\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<intAttribute key=\"default_start_level\" value=\"4\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"includeOptional\" value=\"true\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("key=\"org.eclipse.jdt.launching.ATTR_USE_START_ON_FIRST_THREAD\" value=\"true\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.JRE_CONTAINER\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.PROGRAM_ARGUMENTS\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"-os ${target.os} -ws ${target.ws} -arch ${target.arch} -nl ${target.nl} -consoleLog -console\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.SOURCE_PATH_PROVIDER\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"org.eclipse.pde.ui.workbenchClasspathProvider\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"org.eclipse.jdt.launching.VM_ARGUMENTS\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"-Declipse.ignoreApp=true -Dosgi.noShutdown=true -Dsmags.deployment=");
    String _name = d.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "\t\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"pde.version\" value=\"3.3\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"show_selected_only\" value=\"false\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"target_bundles\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"com.ibm.icu@default:default,javax.inject@default:default,javax.servlet*3.1.0.v201410161800@default:default,javax.xml@default:default,org.apache.batik.css*1.7.0.v201011041433@default:default,org.apache.batik.util*1.7.0.v201011041433@default:default,org.apache.batik.util.gui*1.7.0.v200903091627@default:default,org.apache.commons.jxpath@default:default,org.eclipse.ant.core@default:default,org.eclipse.compare.core@default:default,org.eclipse.core.commands@default:default,org.eclipse.core.contenttype@default:default,org.eclipse.core.databinding.observable@default:default,org.eclipse.core.databinding.property@default:default,org.eclipse.core.databinding@default:default,org.eclipse.core.expressions@default:default,org.eclipse.core.filesystem.win32.x86_64@default:false,org.eclipse.core.filesystem@default:default,org.eclipse.core.jobs@default:default,org.eclipse.core.resources.win32.x86_64@default:false,org.eclipse.core.resources@default:default,org.eclipse.core.runtime@default:true,org.eclipse.core.variables@default:default,org.eclipse.e4.core.commands@default:default,org.eclipse.e4.core.contexts@default:default,org.eclipse.e4.core.di.annotations@default:default,org.eclipse.e4.core.di.extensions@default:default,org.eclipse.e4.core.di@default:default,org.eclipse.e4.core.services@default:default,org.eclipse.e4.emf.xpath@default:default,org.eclipse.e4.ui.bindings@default:default,org.eclipse.e4.ui.css.core@default:default,org.eclipse.e4.ui.css.swt.theme@default:default,org.eclipse.e4.ui.css.swt@default:default,org.eclipse.e4.ui.di@default:default,org.eclipse.e4.ui.model.workbench@default:default,org.eclipse.e4.ui.services@default:default,org.eclipse.e4.ui.widgets@default:default,org.eclipse.e4.ui.workbench.addons.swt@default:default,org.eclipse.e4.ui.workbench.renderers.swt@default:default,org.eclipse.e4.ui.workbench.swt@default:default,org.eclipse.e4.ui.workbench3@default:default,org.eclipse.e4.ui.workbench@default:default,org.eclipse.emf.common@default:default,org.eclipse.emf.ecore.change@default:default,org.eclipse.emf.ecore.xmi@default:default,org.eclipse.emf.ecore@default:default,org.eclipse.equinox.app@default:default,org.eclipse.equinox.bidi@default:default,org.eclipse.equinox.common@2:true,org.eclipse.equinox.event@default:default,org.eclipse.equinox.preferences@default:default,org.eclipse.equinox.registry@default:default,org.eclipse.help@default:default,org.eclipse.jface.databinding@default:default,org.eclipse.jface@default:default,org.eclipse.osgi.compatibility.state@default:false,org.eclipse.osgi.services@default:default,org.eclipse.osgi@-1:true,org.eclipse.swt.win32.win32.x86_64@default:false,org.eclipse.swt@default:default,org.eclipse.team.core@default:default,org.eclipse.ui.trace@default:default,org.eclipse.ui.workbench@default:default,org.eclipse.ui@default:default,org.w3c.css.sac@default:default,org.w3c.dom.events@default:default,org.w3c.dom.smil@default:default,org.w3c.dom.svg@default:default\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"tracing\" value=\"false\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"useCustomFeatures\" value=\"false\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<booleanAttribute key=\"useDefaultConfigArea\" value=\"true\" />");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<stringAttribute key=\"workspace_bundles\"");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value=\"");
    final Function1<String, String> _function = (String p) -> {
      return (p + "@default:default");
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(plugins)), _function);
    String _commaList = this.commaList(_map);
    _builder.append(_commaList, "\t\t");
    _builder.append("\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("</launchConfiguration>\t\t\t");
    _builder.newLine();
    return _builder;
  }
}
