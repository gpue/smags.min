package org.tud.inf.st.smags.dsl.ui.handler;

import org.eclipse.core.resources.IProject;
import org.eclipse.xtext.generator.GeneratorContext;
import org.tud.inf.st.smags.dsl.generator.JavaProjectGenerator;
import org.tud.inf.st.smags.dsl.generator.SmagsGeneratorContext;


public class GenerateSingleJavaProjectHandler extends SmagsGenerationHandler{
	@Override
	protected GeneratorContext createContext(IProject project) {
		return new SmagsGeneratorContext(JavaProjectGenerator.class,project);
	}
}
