/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.svc.war;

import com.icss.regie.retailer.svc.war.soap.RetailerGatewayImpl;
import javax.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

//    @Bean("swagger2Feature")
//    public Feature swagger2Feature() {
//        Swagger2Feature result = new Swagger2Feature();
//        result.setTitle("Spring Boot + CXF + Swagger Example");
//        result.setDescription("Spring Boot + CXF + Swagger Example description");
//        result.setBasePath(this.basePath);
//        result.setVersion("v1");
//        result.setContact("Orlando L Otero");
//        result.setSchemes(new String[]{"http", "https"});
//        result.setPrettyPrint(true);
//        return result;
//    }
//    @Bean
//    public JacksonJsonProvider jsonProvider() {
//        return new JacksonJsonProvider();
//    }
    
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, new RetailerGatewayImpl());
        endpoint.publish("/retailer");
        return endpoint;
    }
}
