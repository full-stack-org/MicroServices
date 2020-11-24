package com.springboot.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartMentMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartMentMicroServiceApplication.class, args);
	}

}
