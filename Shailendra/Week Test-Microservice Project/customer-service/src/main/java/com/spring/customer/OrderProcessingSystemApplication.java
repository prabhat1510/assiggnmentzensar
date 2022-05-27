package com.spring.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderProcessingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProcessingSystemApplication.class, args);
	}

}
