package org.tud.inf.st.smags.repository;

public interface ISmagsEndpoint {

	void createInstance(String port);
	boolean matches(String description);
	Object delegate(String method, Object... args);
	String getId();
	
}
