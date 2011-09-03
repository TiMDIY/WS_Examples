package com.jogano10.ejb;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ICalc {
 
	public String add(String a, String b) ;
}
