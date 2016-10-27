package org.tud.inf.st.smags.repository;

public class PortEntry {
	private String portType;
	private String port;
	private ISmagsEndpoint endpoint;

	public PortEntry(String portType, String port, ISmagsEndpoint endpoint) {
		this.portType = portType;
		this.port = port;
		this.endpoint = endpoint;
	}

	public ISmagsEndpoint getEndpoint() {
		return endpoint;
	}

	public String getPort() {
		return port;
	}

	public String getPortType() {
		return portType;
	}

	@Override
	public String toString() {
		return "PortOffer [portType=" + portType + ", port=" + port + ", endpoint=" + endpoint + "]";
	}
}