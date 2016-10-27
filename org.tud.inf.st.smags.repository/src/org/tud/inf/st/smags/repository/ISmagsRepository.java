package org.tud.inf.st.smags.repository;

import java.util.List;

public interface ISmagsRepository {
	
	List<String> getEndpoints();
	
	List<String> getPorts(String endointId);
	
	void registerPort(String portType, String port);

	void unregisterPort(String port);
	
	String createInstance(String port, String endpointId);
}
