package com.bad115.registroelectricoapp.registroelectricoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RegistroelectricoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroelectricoappApplication.class, args);
	}

}
