/**
 * generated by Xtext 2.10.0
 */
package org.tud.inf.st.smags.dsl.generator;

import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.pde.core.plugin.IPluginModelBase;
import org.eclipse.pde.core.plugin.PluginRegistry;
import org.eclipse.pde.core.project.IBundleProjectDescription;
import org.eclipse.pde.core.project.IBundleProjectService;
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
import org.tud.inf.st.smags.model.smags.Architecture;
import org.tud.inf.st.smags.model.smags.ArchitectureElement;
import org.tud.inf.st.smags.model.smags.Component;
import org.tud.inf.st.smags.model.smags.MetaArchitecture;
import org.tud.inf.st.smags.model.smags.SmagsElement;
import org.tud.inf.st.smags.model.smags.SmagsModel;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EquinoxGenerator extends JavaProjectGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      if ((fsa instanceof EclipseResourceFileSystemAccess2)) {
        final EclipseResourceFileSystemAccess2 eclipseFsa = ((EclipseResourceFileSystemAccess2) fsa);
        EList<EObject> _contents = resource.getContents();
        Iterable<SmagsModel> _filter = Iterables.<SmagsModel>filter(_contents, SmagsModel.class);
        for (final SmagsModel m : _filter) {
          {
            EList<SmagsElement> _elements = m.getElements();
            Iterable<MetaArchitecture> _filter_1 = Iterables.<MetaArchitecture>filter(_elements, MetaArchitecture.class);
            for (final MetaArchitecture a : _filter_1) {
              {
                String _pkg = this.pkg(a);
                final IProject project = this.createProject(_pkg);
                eclipseFsa.setProject(project);
                IJavaProject _extendToJava = this.extendToJava(project);
                this.addSoureFolder(_extendToJava, "src-gen");
                this.addNature(project, "org.eclipse.pde.PluginNature");
                eclipseFsa.setOutputPath(".");
                CharSequence _buildProperties = this.buildProperties();
                ((EclipseResourceFileSystemAccess2)fsa).generateFile("build.properties", _buildProperties);
                this.extendToPlugin(project, "org.eclipse.osgi");
                eclipseFsa.setOutputPath("src-gen");
                this.generateMetaArchitectureFiles(a, fsa);
              }
            }
            EList<SmagsElement> _elements_1 = m.getElements();
            Iterable<Architecture> _filter_2 = Iterables.<Architecture>filter(_elements_1, Architecture.class);
            for (final Architecture a_1 : _filter_2) {
              EList<ArchitectureElement> _elements_2 = a_1.getElements();
              Iterable<Component> _filter_3 = Iterables.<Component>filter(_elements_2, Component.class);
              for (final Component c : _filter_3) {
                {
                  String _pkg = this.pkg(c);
                  final IProject project = this.createProject(_pkg);
                  eclipseFsa.setProject(project);
                  IJavaProject _extendToJava = this.extendToJava(project);
                  this.addSoureFolder(_extendToJava, "src-gen");
                  eclipseFsa.setOutputPath(".");
                  CharSequence _buildProperties = this.buildProperties();
                  ((EclipseResourceFileSystemAccess2)fsa).generateFile("build.properties", _buildProperties);
                  MetaArchitecture _type = a_1.getType();
                  String _pkg_1 = this.pkg(_type);
                  this.extendToPlugin(project, _pkg_1, "org.eclipse.osgi");
                  eclipseFsa.setOutputPath("src-gen");
                  String _pkg_2 = this.pkg(c);
                  String _replaceAll = _pkg_2.replaceAll("\\.", "/");
                  String _plus = (_replaceAll + "/");
                  String _name = c.getName();
                  String _firstUpper = StringExtensions.toFirstUpper(_name);
                  String _plus_1 = (_plus + _firstUpper);
                  String _plus_2 = (_plus_1 + ".java");
                  CharSequence _activator = this.activator(c);
                  ((EclipseResourceFileSystemAccess2)fsa).generateFile(_plus_2, _activator);
                }
              }
            }
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void extendToPlugin(final IProject project, final String... deps) throws CoreException {
    this.addNature(project, "org.eclipse.pde.PluginNature");
    final NullProgressMonitor monitor = new NullProgressMonitor();
    Activator _default = Activator.getDefault();
    final BundleContext context = _default.getContext();
    final ServiceReference<IBundleProjectService> bundleProjectServiceRef = context.<IBundleProjectService>getServiceReference(IBundleProjectService.class);
    final IBundleProjectService bps = context.<IBundleProjectService>getService(bundleProjectServiceRef);
    final IBundleProjectDescription bpd = bps.getDescription(project);
    final ArrayList<String> requiredStrs = CollectionLiterals.<String>newArrayList(deps);
    requiredStrs.add(Activator.PLUGIN_ID);
    final Function1<String, IRequiredBundleDescription> _function = (String s) -> {
      return bps.newRequiredBundle(s, null, false, false);
    };
    final List<IRequiredBundleDescription> required = ListExtensions.<String, IRequiredBundleDescription>map(requiredStrs, _function);
    bpd.setRequiredBundles(((IRequiredBundleDescription[])Conversions.unwrapArray(required, IRequiredBundleDescription.class)));
    String _name = project.getName();
    bpd.setSymbolicName(_name);
    Version _version = new Version("0.1");
    bpd.setBundleVersion(_version);
    bpd.apply(monitor);
    final IPluginModelBase model = PluginRegistry.findModel(project);
    ClasspathComputer.setClasspath(project, model);
  }
  
  protected String pkg(final Component c) {
    EObject _eContainer = c.eContainer();
    String _pkg = this.pkg(((Architecture) _eContainer));
    String _plus = (_pkg + ".");
    String _name = c.getName();
    String _lowerCase = _name.toLowerCase();
    return (_plus + _lowerCase);
  }
  
  protected Object manifest(final String name, final String symbolic, final String... requires) {
    StringConcatenation _builder = new StringConcatenation();
    Object _manifest = this.manifest(name, symbolic);
    _builder.append(_manifest, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Require-Bundle: org.eclipse.osgi");
    {
      for(final String r : requires) {
        _builder.append(",");
        _builder.append("\n", "");
        _builder.append(" ");
        _builder.append(r, "");
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder;
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
    _builder.newLine();
    _builder.append("public class ");
    String _name = c.getName();
    String _firstUpper = StringExtensions.toFirstUpper(_name);
    _builder.append(_firstUpper, "");
    _builder.append(" implements BundleActivator{");
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
}
