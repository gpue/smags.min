package org.tud.inf.st.smags.repository;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.websocket.WebSocket;
import org.eclipse.jetty.websocket.WebSocketHandler;

public class SmagsRepositoryServer extends Thread {
	private static final int PORT = System.getProperty("smags.repo.port") == null ? 8080
			: Integer.parseInt(System.getProperty("smags.repo.port"));

	public static void main(String[] args) {
		new SmagsRepositoryServer().start();
	}
	
	public SmagsRepositoryServer() {
		super(SmagsRepositoryServer.class.getSimpleName());
	}

	@Override
	public void run() {
		final SmagsRepositoryBlackboard blackboard = new SmagsRepositoryBlackboard();
		
		Server server = new Server(PORT);
		
		ContextHandler root = new ContextHandler("/");
		root.setAllowNullPathInfo(true);
		root.setHandler(new WebSocketHandler() {
			
			@Override
			public WebSocket doWebSocketConnect(HttpServletRequest r, String s) {
				return new SmagsRepositoryHandler(blackboard);
			}
		});
		
		
		server.setHandler(root);
		
		try {
			server.start();
			while (!isInterrupted()) {
				Thread.sleep(1000);
			}
			server.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
