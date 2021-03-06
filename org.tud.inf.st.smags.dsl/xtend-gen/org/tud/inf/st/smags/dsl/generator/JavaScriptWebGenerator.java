/**
 * generated by Xtext 2.10.0
 */
package org.tud.inf.st.smags.dsl.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URI;
import java.net.URL;
import java.util.Collections;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.tud.inf.st.smags.dsl.Activator;
import org.tud.inf.st.smags.dsl.generator.EquinoxGenerator;
import org.tud.inf.st.smags.model.smags.Architecture;
import org.tud.inf.st.smags.model.smags.MetaArchitecture;
import org.tud.inf.st.smags.model.smags.SmagsElement;
import org.tud.inf.st.smags.model.smags.SmagsModel;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class JavaScriptWebGenerator extends EquinoxGenerator {
  @Override
  protected void doGenerate(final Resource resource, final EclipseResourceFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EList<EObject> _contents = resource.getContents();
      Iterable<SmagsModel> _filter = Iterables.<SmagsModel>filter(_contents, SmagsModel.class);
      for (final SmagsModel m : _filter) {
        EList<SmagsElement> _elements = m.getElements();
        Iterable<Architecture> _filter_1 = Iterables.<Architecture>filter(_elements, Architecture.class);
        for (final Architecture a : _filter_1) {
          {
            String _pkg = this.pkg(a);
            IProject project = this.createProject(_pkg);
            fsa.setProject(project);
            IJavaProject _extendToJava = this.extendToJava(project);
            this.addSoureFolder(_extendToJava, "src-gen");
            fsa.setOutputPath(".");
            CharSequence _buildProperties = this.buildProperties();
            fsa.generateFile("build.properties", _buildProperties);
            String _name = a.getName();
            String _plus = ("WEB-INF/" + _name);
            String _plus_1 = (_plus + ".html");
            CharSequence _html = this.html(a);
            fsa.generateFile(_plus_1, _html);
            String _name_1 = a.getName();
            String _plus_2 = ("WEB-INF/" + _name_1);
            String _plus_3 = (_plus_2 + ".js");
            CharSequence _javascript = this.javascript(a);
            fsa.generateFile(_plus_3, _javascript);
            String _readResource = this.readResource("resources/smags.js");
            fsa.generateFile("WEB-INF/smags.js", _readResource);
            MetaArchitecture _type = a.getType();
            String _name_2 = _type.getName();
            String _plus_4 = ("WEB-INF/" + _name_2);
            String _plus_5 = (_plus_4 + ".js");
            MetaArchitecture _type_1 = a.getType();
            CharSequence _javascript_1 = this.javascript(_type_1);
            fsa.generateFile(_plus_5, _javascript_1);
            fsa.setOutputPath("src-gen");
            String _pkg_1 = this.pkg(a);
            String _replaceAll = _pkg_1.replaceAll("\\.", "/");
            String _plus_6 = (_replaceAll + "/");
            String _name_3 = a.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_3);
            String _plus_7 = (_plus_6 + _firstUpper);
            String _plus_8 = (_plus_7 + "WebActivator.java");
            CharSequence _activator = this.activator(a);
            fsa.generateFile(_plus_8, _activator);
            String _pkg_2 = this.pkg(a);
            String _pkg_3 = this.pkg(a);
            String _plus_9 = (_pkg_3 + ".");
            String _name_4 = a.getName();
            String _firstUpper_1 = StringExtensions.toFirstUpper(_name_4);
            String _plus_10 = (_plus_9 + _firstUpper_1);
            String _plus_11 = (_plus_10 + "WebActivator");
            this.extendToPlugin(project, ((String[])Conversions.unwrapArray(Collections.<String>unmodifiableSet(CollectionLiterals.<String>newHashSet(_pkg_2)), String.class)), _plus_11, "org.eclipse.osgi", 
              "org.tud.inf.st.smags.repository");
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  protected String pkg(final Architecture a) {
    String _pkg = super.pkg(a);
    return (_pkg + ".web");
  }
  
  protected String readResource(final String path) {
    try {
      Activator _default = Activator.getDefault();
      BundleContext _context = _default.getContext();
      Bundle _bundle = _context.getBundle();
      final URL url = _bundle.getEntry(path);
      URL _resolve = FileLocator.resolve(url);
      URI _uRI = _resolve.toURI();
      File file = new File(_uRI);
      final StringBuffer buf = new StringBuffer();
      FileReader _fileReader = new FileReader(file);
      final BufferedReader reader = new BufferedReader(_fileReader);
      String line = "";
      while ((!Objects.equal((line = reader.readLine()), null))) {
        buf.append((line + "\n\r"));
      }
      reader.close();
      return buf.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
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
    _builder.append("WebActivator implements BundleActivator{");
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
  
  protected CharSequence javascript(final MetaArchitecture a) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence javascript(final Architecture a) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  protected CharSequence html(final Architecture a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<header>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>");
    String _name = a.getName();
    _builder.append(_name, "\t\t");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</header>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>");
    String _name_1 = a.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
