package org.tud.inf.st.smags.dsl.ui.handler;

import org.eclipse.xtext.generator.GeneratorContext;
import org.tud.inf.st.smags.dsl.generator.EquinoxGenerator;
import org.tud.inf.st.smags.dsl.generator.SmagsGeneratorContext;


public class GenerateEquinoxHandler extends SmagsGenerationHandler{
	@Override
	protected GeneratorContext createContext() {
		return new SmagsGeneratorContext(EquinoxGenerator.class);
	}
}
