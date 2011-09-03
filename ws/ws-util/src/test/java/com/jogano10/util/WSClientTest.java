package com.jogano10.util;

import junit.framework.Assert;

import org.junit.Test;

import com.jogano10.wsclient.CalcService;
import com.jogano10.wsclient.ICalc;

public class WSClientTest {

	@Test
	public void addSimpleTest() {
	 
		CalcService calcService = new CalcService();
		ICalc iCalc = calcService.getCalcPort();
		Assert.assertEquals("3",iCalc.add("1", "2"));
	 

	}
}
