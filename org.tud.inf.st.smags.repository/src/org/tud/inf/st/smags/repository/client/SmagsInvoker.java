package org.tud.inf.st.smags.repository.client;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Observable;
import java.util.Observer;

import org.tud.inf.st.smags.repository.SmagsRepositoryHandler;
import org.tud.inf.st.smags.repository.messages.RPCRequest;
import org.tud.inf.st.smags.repository.messages.RPCResponse;

import com.google.gson.Gson;

public class SmagsInvoker implements InvocationHandler {
	private static final Gson GSON = new Gson();
	private static int rpcId = 0;

	private static class ObserverWaiter implements Observer {

		private RPCResponse result;
		private boolean done = false;
		private int rpcId;

		public ObserverWaiter(int rpcId) {
			this.rpcId = rpcId;
		}

		@Override
		public void update(Observable o, Object arg) {
			if (arg instanceof RPCResponse && ((RPCResponse) arg).getRpcId() == rpcId) {
				result = (RPCResponse) arg;
				done = true;
				notifyAll();
			}
		}

		public synchronized boolean isDone() {
			return done;
		}

		public Object getResult() {
			return result.getPayload();
		}
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (!(proxy instanceof SmagsRepositoryHandler))
			throw new Exception("wrong invocation target");

		SmagsRepositoryHandler handler = (SmagsRepositoryHandler) proxy;
		final int rpcId = (SmagsInvoker.rpcId++);

		RPCRequest req = new RPCRequest(rpcId, method.getName(), args);

		ObserverWaiter ow = new ObserverWaiter(rpcId);
		handler.addObserver(ow);
		handler.sendMessage(GSON.toJson(req));
		
		synchronized (ow) {
			while(!ow.isDone())
				ow.wait();
		}

		handler.deleteObserver(ow);
		return ow.getResult();
	}

}
