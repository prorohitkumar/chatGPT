package com.stackroute.AIChat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AiChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiChatApplication.class, args);
	}

}
