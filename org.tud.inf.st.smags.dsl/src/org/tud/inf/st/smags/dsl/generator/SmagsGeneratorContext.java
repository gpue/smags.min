package org.tud.inf.st.smags.dsl.generator;

import org.eclipse.core.resources.IProject;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IGenerator2;

public class SmagsGeneratorContext extends GeneratorContext {
	private Class<? extends IGenerator2> concreteGenerator;
	private IProject project;
	
	public SmagsGeneratorContext(Class<? extends IGenerator2> concreteGenerator, IProject project) {
		this.concreteGenerator = concreteGenerator;
		this.project = project;
	}
	
	public Class<? extends IGenerator2> getConcreteGenerator() {
		return concreteGenerator;
	}
	
	public IProject getProject() {
		return project;
	}
}
