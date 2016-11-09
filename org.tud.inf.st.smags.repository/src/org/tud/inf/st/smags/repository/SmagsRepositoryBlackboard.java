package org.tud.inf.st.smags.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SmagsRepositoryBlackboard {
	private List<ISmagsEndpoint> endpoints = new ArrayList<>();
	private List<PortEntry> entries = new ArrayList<>();

	public void registerPort(String portType, String port, ISmagsEndpoint endpoint) {
		entries.add(new PortEntry(portType, port, endpoint));
	}

	public void unregisterPort(String port, ISmagsEndpoint endpoint) {
		Optional<PortEntry> opt = entries.stream()
				.filter(o -> o.getPort().equals(port) && o.getEndpoint().equals(endpoint)).findFirst();
		if (opt.isPresent())
			entries.remove(opt.get());
	}

	public ISmagsEndpoint getEndpoint(String endpointId) {
		Optional<ISmagsEndpoint> opt = endpoints.stream().filter(e -> e.getId().equals(endpointId)).findAny();
		return opt.isPresent() ? opt.get() : null;
	}

	public List<String> getEndpoints() {
		return endpoints.stream().map(e -> e.getId()).collect(Collectors.toList());
	}

	public void registerEndpoint(ISmagsEndpoint endpoint) {
		endpoints.add(endpoint);
	}

	public void unregisterEndpoint(ISmagsEndpoint endpoint) {
		endpoints.remove(endpoint);
	}

	public List<String> getPorts(String endpoint) {
		return entries.stream().filter(pe -> pe.getEndpoint().getId().equals(endpoint)).map(pe -> pe.getPort())
				.collect(Collectors.toList());
	}
}
