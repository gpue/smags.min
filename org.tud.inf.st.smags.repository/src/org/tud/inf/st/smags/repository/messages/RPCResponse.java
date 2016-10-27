package org.tud.inf.st.smags.repository.messages;

public class RPCResponse {
	private int rpcId;
	private Object payload;

	public RPCResponse(int rpcId, Object payload) {
		this.rpcId = rpcId;
		this.payload = payload;
	}

	public int getRpcId() {
		return rpcId;
	}

	public Object getPayload() {
		return payload;
	}
}
