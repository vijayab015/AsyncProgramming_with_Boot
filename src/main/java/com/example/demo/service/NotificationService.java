package com.example.demo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

	@Async
	public void sendTextMessage(String Mobile) {
		// Business Logic for Message service 3rd party
		sleep(5);
		System.out.println("Called 3rd party to send Text Message" +Thread.currentThread().getName());
		System.out.println(10/0);
	}

	private void sleep(int t) {
		try {
			TimeUnit.SECONDS.sleep(t);
			
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
	}

}
