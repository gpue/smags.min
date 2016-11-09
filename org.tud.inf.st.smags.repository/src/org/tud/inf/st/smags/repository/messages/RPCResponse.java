package org.tud.inf.st.smags.repository.messages;

public class RPCResponse {
	private int rpcId;
	private Object payload;
	private String payloadType;

	public RPCResponse(int rpcId, Object payload) {
		this.rpcId = rpcId;
		this.payload = payload;
		this.payloadType = payload.getClass().getName();
	}

	public int getRpcId() {
		return rpcId;
	}

	public Object getPayload() {
		return payload;
	}
	
	public String getPayloadType() {
		return payloadType;
	}
}
