package com.jogano10;

import org.junit.Test;

import com.jogano10.client.JohnnyCashService;
import com.jogano10.client.Singer;

public class WSClientTest {

	@Test
	public void singJohnnyCash() {
		System.out.println("Please, Be sure that WS is online");

		JohnnyCashService johnnyCashService = new JohnnyCashService();
		Singer singer = johnnyCashService.getJohnnyCashPort();
		System.out.println(singer.sing("One"));
		
		System.out.println("");
	}
}
