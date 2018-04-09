package com.example.boot.eureka.server;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	private static Logger logger = LoggerFactory.getLogger(EurekaServerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
