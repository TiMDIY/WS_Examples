package com.jogano10.util;

import junit.framework.Assert;

import org.junit.Test;

import com.jogano10.web.TemperatureConverter;
import com.jogano10.web.TemperatureConverterService;
import com.jogano10.wsclient.CalcService;
import com.jogano10.wsclient.ICalc;

public class WSClientTest {

	@Test
	public void addSimpleTest() {
	 
		CalcService calcService = new CalcService();
		ICalc iCalc = calcService.getCalcPort();
		Assert.assertEquals("3",iCalc.add("1", "2"));
	 

	}
	
	@Test
	public void temperatureConverterSimpleTest() {
		
		TemperatureConverterService temperatureConverterService = new TemperatureConverterService();
		TemperatureConverter temperatureConverter = temperatureConverterService.getTemperatureConverterPort();
		//FIXME
		Assert.assertEquals("0.0",temperatureConverter.celsiusToFarenheint(0));
	}
}
