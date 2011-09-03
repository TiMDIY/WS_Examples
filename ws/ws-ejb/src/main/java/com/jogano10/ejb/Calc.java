package com.jogano10.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;


@Stateless
@WebService(endpointInterface = "com.jogano10.ejb.ICalc")
@Remote(ICalc.class)
public class Calc {
	
	@WebMethod(operationName = "add")
	public String add(String a, String b) {
		return new Integer((new Integer(a)).intValue()
				+ (new Integer(b)).intValue()).toString();
	}
}
