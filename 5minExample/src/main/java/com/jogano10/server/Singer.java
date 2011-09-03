package com.jogano10.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Singer {

	@WebMethod
	String sing(String song);
}