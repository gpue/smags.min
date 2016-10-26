package org.tud.inf.st.smags.repository;

import org.eclipse.jetty.websocket.WebSocket;

public class SmagsRepositoryHandler implements ISmagsRepository, WebSocket.OnTextMessage {

	private SmagsRepositoryBlackboard blackboard;

	public SmagsRepositoryHandler(SmagsRepositoryBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	@Override
	public void registerPort(String portType, String port) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterPort(String portClass) {
		// TODO Auto-generated method stub

	}

	@Override
	public String createInstance(String portType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delegate(String instanceId, String method, Object... args) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onClose(int arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onOpen(Connection arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMessage(String arg0) {
		// TODO Auto-generated method stub

	}

}