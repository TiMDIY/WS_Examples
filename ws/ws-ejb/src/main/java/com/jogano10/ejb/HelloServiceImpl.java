package com.jogano10.ejb;

import javax.ejb.Stateless;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * Session Bean implementation class HelloServiceImpl
 */
@Stateless(mappedName = "helloService")
public class HelloServiceImpl implements HelloService {

	private static Logger LOG = Logger.getLogger(HelloServiceImpl.class);

	private static String DEFAULT_NAME = "World"; 
	
	public String greet(String name) {
		String finalName = StringUtils.defaultIfEmpty(name, DEFAULT_NAME);
		String greeting =  "Hello "+finalName;
		LOG.debug(greeting);
		return greeting;
	}
}
