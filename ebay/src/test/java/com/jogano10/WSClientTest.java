package com.jogano10;

import org.junit.Test;

import com.ebay.marketplace.search.v1.services.FindingService;
import com.ebay.marketplace.search.v1.services.FindingServicePortType;
import com.ebay.marketplace.search.v1.services.GetVersionRequest;

public class WSClientTest {

	@Test
	public void singJohnnyCash() {
		 
		FindingService johnnyCashService = new FindingService();
		FindingServicePortType singer = johnnyCashService.getFindingServiceSOAPPort();
		
		GetVersionRequest messageParameters = new  GetVersionRequest();
	
		singer.getVersion(messageParameters);
		System.out.println();

	}
}
