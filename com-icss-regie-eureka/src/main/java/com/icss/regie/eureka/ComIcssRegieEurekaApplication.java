package com.icss.regie.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ComIcssRegieEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComIcssRegieEurekaApplication.class, args);
	}
}
