package network;

import model.ProxyCarnet;

public class TCPClient {
	
	public static final String HOSTNAME = "localhost";
	public static final int PORT = 3000;
	static ProxyCarnet proxyCarnet;
	
	public static void main(String[] args) {
		
		try {	
			proxyCarnet = new ProxyCarnet(HOSTNAME, PORT);
		} catch (Exception e) {
			e.printStackTrace();;
		}
	}

	public static ProxyCarnet getProxyCarnet() {
	    if (proxyCarnet == null) {
	    	return new ProxyCarnet(HOSTNAME, PORT);
	    }
		return proxyCarnet;
	}

	public static void setProxyCarnet(ProxyCarnet proxyCarnet) {
	    TCPClient.proxyCarnet = proxyCarnet;
	}
}
