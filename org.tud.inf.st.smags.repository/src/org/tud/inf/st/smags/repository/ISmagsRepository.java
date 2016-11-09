package org.tud.inf.st.smags.repository;

import java.util.List;

public interface ISmagsRepository {
	
	List<String> getEndpoints();
	
	List<String> getPorts(String endointId);
	
	void registerPort(String portType, String port);

	void unregisterPort(String port);
	
	void createInstance(String port, String endpointId);
}
