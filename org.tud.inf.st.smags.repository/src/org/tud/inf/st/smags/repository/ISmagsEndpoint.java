package org.tud.inf.st.smags.repository;

public interface ISmagsEndpoint {

	String createInstance(String port);
	boolean matches(String description);
	void delegate(String instanceId, String method, Object... args);
	String getId();
	
}
