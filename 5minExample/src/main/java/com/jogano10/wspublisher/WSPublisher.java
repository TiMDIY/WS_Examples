package com.jogano10.wspublisher;

import javax.xml.ws.Endpoint;

import com.jogano10.server.JohnnyCash;

public class WSPublisher {
	private Endpoint endpoint;
	
	public void run(){
		endpoint = Endpoint.publish("http://localhost:8080/WS/Singer", new JohnnyCash());
		
	}
	
	public void stop(){
		endpoint.stop();
		
	}
	
	 
	
	public static void main(String[] args) {
		WSPublisher wsPublisher = new WSPublisher();
		wsPublisher.run();
	}

}
