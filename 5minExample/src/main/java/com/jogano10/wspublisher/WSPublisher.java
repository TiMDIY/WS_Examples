package com.jogano10.wspublisher;

import javax.xml.ws.Endpoint;

import com.jogano10.server.JohnnyCash;

public class WSPublisher {
	
	public void run(){
		Endpoint.publish("http://localhost:8080/WS/Singer", new JohnnyCash());
	}
	
	 
	
	public static void main(String[] args) {
		WSPublisher wsPublisher = new WSPublisher();
		wsPublisher.run();
	}

}
