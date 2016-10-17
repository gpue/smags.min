/**
 * generated by Xtext 2.10.0
 */
package org.tud.inf.st.smags.dsl.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.tud.inf.st.smags.dsl.generator.SmagsGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DSLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      if ((context instanceof SmagsGeneratorContext)) {
        final Class<? extends IGenerator2> concreteGenerator = ((SmagsGeneratorContext) context).getConcreteGenerator();
        final IGenerator2 generator = concreteGenerator.newInstance();
        generator.doGenerate(resource, fsa, context);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
