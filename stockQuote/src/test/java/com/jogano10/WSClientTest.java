package com.jogano10;

import java.rmi.RemoteException;

import org.junit.Test;

import NET.webserviceX.www.StockQuoteSoap;
import NET.webserviceX.www.StockQuoteSoapProxy;

public class WSClientTest {

	@Test
	public void getStockQuoteExample() {
		 	
		StockQuoteSoapProxy stockQuoteSoapProxy = new StockQuoteSoapProxy();
		StockQuoteSoap stockQuoteSoap = stockQuoteSoapProxy.getStockQuoteSoap();
		
		 
		try {
			System.out.println(stockQuoteSoap.getQuote("MMM"));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
