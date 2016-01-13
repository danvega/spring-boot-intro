package com.therealdanvega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SendingEmailAsyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendingEmailAsyncApplication.class, args);
	}
}
