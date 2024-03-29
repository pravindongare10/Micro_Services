package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsProduserApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MsProduserApplication.class, args);
	}

}
