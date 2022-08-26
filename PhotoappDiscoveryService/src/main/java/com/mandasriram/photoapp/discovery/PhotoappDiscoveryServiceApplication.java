package com.mandasriram.photoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
// this is eureka discovery service
public class PhotoappDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoappDiscoveryServiceApplication.class, args); 
	}

}
