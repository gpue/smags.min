package org.tud.inf.st.smags.dsl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	public static final String PLUGIN_ID = "org.tud.inf.st.smags.dsl";
	private static Activator instance;
	
	public static Activator getDefault() {
		return instance;
	}
	
	private BundleContext context;
	
	@Override
	public void start(BundleContext context) throws Exception {
		instance = this;
		this.context = context;

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		this.context = null;
	}
	
	public BundleContext getContext() {
		return context;
	}

}
