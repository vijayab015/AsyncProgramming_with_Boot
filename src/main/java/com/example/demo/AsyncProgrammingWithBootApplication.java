package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncProgrammingWithBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncProgrammingWithBootApplication.class, args);
	}

}
