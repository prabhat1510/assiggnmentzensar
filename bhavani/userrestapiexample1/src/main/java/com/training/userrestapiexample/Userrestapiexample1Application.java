package com.training.userrestapiexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Userrestapiexample1Application {

	public static void main(String[] args) {
		SpringApplication.run(Userrestapiexample1Application.class, args);
	}

}
