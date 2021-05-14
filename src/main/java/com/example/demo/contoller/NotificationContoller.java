package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.NotificationService;

@RestController
@RequestMapping("/message")
public class NotificationContoller {

	@Autowired
	private NotificationService notificationService;

	
	@GetMapping("/send")
	public String sendMessage(@RequestParam String mobile) {
		
		notificationService.sendTextMessage(mobile);
		return "Text message has been sucessfully Sent "+Thread.currentThread().getName();
	}

}
