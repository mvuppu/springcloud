package com.hdb.cloud.service.maintainservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MaintainserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaintainserviceApplication.class, args);
	}
}
