package com.jogano10.server;

import javax.jws.WebService;

@WebService(endpointInterface = "com.jogano10.server.Singer")
public class JohnnyCash implements Singer {

	@Override
	public String sing(String song) {
		//some logic here with song
		return "What have I become. My sweetest friend. Everyone I know goes away. In the end ..";
	}
}