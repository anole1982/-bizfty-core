package com.icss.regie.registry.eureka;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistryEurekaApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(RegistryEurekaApplication.class, args);
	}
        
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return configureApplication(builder);
	}
        
	private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
		return builder.sources(RegistryEurekaApplication.class).bannerMode(Banner.Mode.OFF);
	}
}
