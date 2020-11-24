package com.springboot.service.registery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UserDepartmentServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDepartmentServiceRegisteryApplication.class, args);
	}

}
