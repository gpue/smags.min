/**
 * generated by Xtext 2.10.0
 */
package org.tud.inf.st.smags.dsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.tud.inf.st.smags.model.smags.Architecture;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Architecture> _filter = Iterables.<Architecture>filter(_iterable, Architecture.class);
    for (final Architecture a : _filter) {
      String _name = a.getName();
      String _plus = (_name + ".java");
      CharSequence _compile = this.compile(a);
      fsa.generateFile(_plus, _compile);
    }
  }
  
  public CharSequence compile(final Architecture a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    String _name = a.getName();
    _builder.append(_name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}