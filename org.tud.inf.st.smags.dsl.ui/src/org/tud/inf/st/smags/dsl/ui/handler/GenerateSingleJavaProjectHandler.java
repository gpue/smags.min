package org.tud.inf.st.smags.dsl.ui.handler;

import org.eclipse.xtext.generator.GeneratorContext;
import org.tud.inf.st.smags.dsl.generator.SingleJavaProjectGenerator;
import org.tud.inf.st.smags.dsl.generator.SmagsGeneratorContext;


public class GenerateSingleJavaProjectHandler extends SmagsGenerationHandler{
	@Override
	protected GeneratorContext createContext() {
		return new SmagsGeneratorContext(SingleJavaProjectGenerator.class);
	}
}
