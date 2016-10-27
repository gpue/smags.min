package org.tud.inf.st.smags.repository;

import java.io.IOException;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.eclipse.jetty.websocket.WebSocket;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SmagsRepositoryHandler extends Observable implements ISmagsRepository, ISmagsEndpoint, WebSocket.OnTextMessage {
	
	private static final Gson GSON = new Gson();
	
	private SmagsRepositoryBlackboard blackboard;
	private Connection connection;
	private BlockingQueue<JsonObject> responseQueue = new LinkedBlockingQueue<>();

	public SmagsRepositoryHandler(SmagsRepositoryBlackboard blackboard) {
		this.blackboard = blackboard;
	}

	@Override
	public void registerPort(String portType, String port) {
		blackboard.registerPort(portType, port, this);
	}

	@Override
	public void unregisterPort(String port) {
		blackboard.unregisterPort(port, this);
	}

	@Override
	public String createInstance(String port, String endpointId) {
		return blackboard.getEndpoint(endpointId).createInstance(port);
	}

	@Override
	public List<String> getEndpoints() {
		return blackboard.getEndpoints();
	}

	@Override
	public void onClose(int arg0, String arg1) {
		blackboard.unregisterEndpoint(this);
		this.connection = null;
	}
	
	public void sendMessage(String msg){
		try {
			this.connection.sendMessage(msg);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void onOpen(Connection con) {
		this.connection = con;
		blackboard.registerEndpoint(this);
	}

	@Override
	public void onMessage(String msg) {
		setChanged();
		notifyObservers(msg);
	}

	@Override
	public String createInstance(String port) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delegate(String instanceId, String method, Object... args) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean matches(String description) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getPorts(String endointId) {
		// TODO Auto-generated method stub
		return null;
	}



}