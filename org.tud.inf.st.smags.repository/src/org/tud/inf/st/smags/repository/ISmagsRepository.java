package org.tud.inf.st.smags.repository;

public interface ISmagsRepository {
	void registerPort(String portType, String port);

	void unregisterPort(String portClass);

	String createInstance(String portType);

	void delegate(String instanceId, String method, Object... args);
}
