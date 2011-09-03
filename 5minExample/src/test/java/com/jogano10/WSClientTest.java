package com.jogano10;

import junit.framework.Assert;

import org.junit.Test;

import com.jogano10.client.JohnnyCashService;
import com.jogano10.client.Singer;
import com.jogano10.server.JohnnyCash;
import com.jogano10.wspublisher.WSPublisher;

public class WSClientTest {

	@Test
	public void singJohnnyCash() {
		WSPublisher publisher = new WSPublisher();
		publisher.run();
		JohnnyCashService johnnyCashService = new JohnnyCashService();
		Singer singer = johnnyCashService.getJohnnyCashPort();
		Assert.assertEquals(JohnnyCash.ONE,singer.sing("One"));
		publisher.stop();

	}
}
