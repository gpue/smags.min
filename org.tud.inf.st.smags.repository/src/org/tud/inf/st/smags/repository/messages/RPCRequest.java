package org.tud.inf.st.smags.repository.messages;

public class RPCRequest {
	private int rpcId;
	private String method;
	private Object[] args;

	public RPCRequest(int rpcId, String method, Object[] args) {
		this.rpcId = rpcId;
		this.method = method;
		this.args = args;
	}

	public int getRpcId() {
		return rpcId;
	}

	public String getMethod() {
		return method;
	}

	public Object[] getArgs() {
		return args;
	}
}
