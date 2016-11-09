package org.tud.inf.st.smags.repository;

import java.io.IOException;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Logger;

import org.eclipse.jetty.websocket.WebSocket;
import org.tud.inf.st.smags.repository.messages.RPCRequest;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class SmagsRepositoryHandler extends Observable implements ISmagsRepository, ISmagsEndpoint, WebSocket.OnTextMessage {
	
	private static final Gson GSON = new Gson();
	
	private SmagsRepositoryBlackboard blackboard;
	private Connection connection;
	private BlockingQueue<JsonObject> responseQueue = new LinkedBlockingQueue<>();
	private Logger log;

	private int rpcId = 0;

	public SmagsRepositoryHandler(SmagsRepositoryBlackboard blackboard, String from) {
		this.blackboard = blackboard;
		log = Logger.getLogger(from);
	}

	@Override
	public void registerPort(String portType, String port) {
		blackboard.registerPort(portType, port, this);
		log.info("registered new port: "+port+" of type "+portType);
	}

	@Override
	public void unregisterPort(String port) {
		blackboard.unregisterPort(port, this);
		log.info("unregistered port: "+port);
	}

	@Override
	public void createInstance(String port, String endpointId) {
		blackboard.getEndpoint(endpointId).createInstance(port);
		log.info("requesting port "+port+" at endpoint "+endpointId);
	}

	@Override
	public List<String> getEndpoints() {
		return blackboard.getEndpoints();
	}
	
	@Override
	public List<String> getPorts(String endointId) {
		return blackboard.getPorts(endointId);

	}

	@Override
	public void onClose(int arg0, String arg1) {
		blackboard.unregisterEndpoint(this);
		this.connection = null;
		log.info("closed");
	}
	
	public void sendMessage(String msg){
		try {
			this.connection.sendMessage(msg);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void sendMessage(Object o){
		sendMessage(GSON.toJson(o));
	}
	
	@Override
	public void onOpen(Connection con) {
		this.connection = con;
		blackboard.registerEndpoint(this);
		log.info("opened");
	}

	@Override
	public void onMessage(String msg) {
		setChanged();
		notifyObservers(msg);
	}

	@Override
	public void createInstance(String port) {
		delegate("createInstance",port);
		log.info("creating instance of "+port);
	}

	@Override
	public Object delegate(String method, Object... args) {		
		log.info("calling method "+method+" with args "+args);
		sendMessage(new RPCRequest(rpcId ++, method, args));
		return null;	}

	@Override
	public boolean matches(String description) {
		return (Boolean)delegate("matches",description); 
	}

	@Override
	public String getId() {
		return (String)delegate("getId"); 

	}
}