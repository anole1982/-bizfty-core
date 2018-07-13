package com.icss.regie.retailer.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
	
	JerseyConfig(){
		register(RetailerResource.class);
	}
	
}
