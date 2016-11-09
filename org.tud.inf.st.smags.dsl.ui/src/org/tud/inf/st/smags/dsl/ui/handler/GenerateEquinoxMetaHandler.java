package org.tud.inf.st.smags.dsl.ui.handler;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.tud.inf.st.smags.dsl.generator.EquinoxMetaGenerator;
import org.tud.inf.st.smags.dsl.generator.SmagsGeneratorContext;


public class GenerateEquinoxMetaHandler extends SmagsGenerationHandler{
	@Override
	protected GeneratorContext createContext(IProject project) {
		return new SmagsGeneratorContext(EquinoxMetaGenerator.class,project);
	}
	
	@Override
	protected void configureFileSystemAccess(IFile file, EclipseResourceFileSystemAccess2 fsa) {					
		fsa.setProject(file.getProject());
		fsa.setOutputPath(file.getProject().getProjectRelativePath().toString());
	}
}
