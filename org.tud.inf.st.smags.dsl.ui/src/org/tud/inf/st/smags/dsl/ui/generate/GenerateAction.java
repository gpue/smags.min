package org.tud.inf.st.smags.dsl.ui.generate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Provider;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.actions.ActionDelegate;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class GenerateAction extends ActionDelegate{
	
	private List<IFile> selected = new ArrayList<IFile>();
	
	@Inject
	private IGenerator generator;

	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;

	@Inject
	IResourceDescriptions resourceDescriptions;

	@Inject
	IResourceSetProvider resourceSetProvider;

	@Override
	public void run(IAction action) {
		if(selected.isEmpty())return;
		
		System.out.println(generator);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		selected.clear();
		Iterator<?> i = ((StructuredSelection) selection).iterator();
		while(i.hasNext()){
			Object o = i.next();
			if(o instanceof IFile){
				selected.add((IFile) o);
			}
		}
	}

}
