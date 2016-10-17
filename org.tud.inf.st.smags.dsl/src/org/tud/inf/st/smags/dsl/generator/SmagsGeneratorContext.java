package org.tud.inf.st.smags.dsl.generator;

import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;

public class SmagsGeneratorContext extends GeneratorContext {
	private Class<? extends IGenerator2> concreteGenerator;
	
	public SmagsGeneratorContext(Class<? extends IGenerator2> concreteGenerator) {
		this.concreteGenerator = concreteGenerator;
	}
	
	public Class<? extends IGenerator2> getConcreteGenerator() {
		return concreteGenerator;
	}
}
