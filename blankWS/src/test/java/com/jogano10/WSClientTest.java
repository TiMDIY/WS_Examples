package com.jogano10;

import java.rmi.RemoteException;

import junit.framework.Assert;

import net.webservicex.www.GeoIP;
import net.webservicex.www.GeoIPServiceSoap;
import net.webservicex.www.GeoIPServiceSoapProxy;

import org.junit.Test;

public class WSClientTest {

	@Test
	public void getStockQuoteExample() {
		 	
		GeoIPServiceSoapProxy geoIPSoapProxy = new GeoIPServiceSoapProxy();
		GeoIPServiceSoap geoIPSoap = geoIPSoapProxy.getGeoIPServiceSoap();
		
		 
		try {
			GeoIP geoIp = geoIPSoap.getGeoIP("201.82.159.235");
			Assert.assertEquals(geoIp.getCountryName(), "Brazil");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
