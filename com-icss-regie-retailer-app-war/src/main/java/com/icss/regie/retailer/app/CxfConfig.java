package com.icss.regie.retailer.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.icss.regie.retailer.app.api.resources.RetailerResource;
import java.util.Arrays;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.interceptor.JAXRSDefaultFaultOutInterceptor;
import org.apache.cxf.jaxrs.provider.JAXBElementProvider;
import org.apache.cxf.jaxrs.validation.JAXRSBeanValidationInInterceptor;
import org.apache.cxf.jaxrs.validation.JAXRSBeanValidationOutInterceptor;
import org.apache.cxf.validation.BeanValidationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    @Qualifier("retailerResource")
    private RetailerResource retailerResource;

    @Bean
    public ValidationExceptionMapper validationExceptionMapper() {
        return new ValidationExceptionMapper();
    }
    @Bean
    public ExceptionHandler exceptionHandler() {
        return new ExceptionHandler();
    }
    @Bean
    public BeanValidationProvider beanValidationProvider() {
        return new BeanValidationProvider();
    }
    @Bean
    public JAXBElementProvider jaxbElementProvider() {
        return new JAXBElementProvider();
    }
    @Bean
    public JacksonJsonProvider jacksonJsonProvider(ObjectMapper objectMapper) {
        JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
        provider.setMapper(objectMapper);
        return provider;
    }
    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
    
    @Bean
    public JAXRSBeanValidationInInterceptor validationInInterceptor(BeanValidationProvider beanValidationProvider){
       JAXRSBeanValidationInInterceptor interceptor = new JAXRSBeanValidationInInterceptor();
       interceptor.setProvider(beanValidationProvider);
       return interceptor;
    }
    @Bean
    public JAXRSBeanValidationOutInterceptor validationOutInterceptor(BeanValidationProvider beanValidationProvider){
       JAXRSBeanValidationOutInterceptor interceptor = new JAXRSBeanValidationOutInterceptor();
       interceptor.setProvider(beanValidationProvider);
       return interceptor;
    }
    @Bean 
    public JAXRSDefaultFaultOutInterceptor defaultFaultOutInterceptor(){
        JAXRSDefaultFaultOutInterceptor interceptor = new JAXRSDefaultFaultOutInterceptor();
        return interceptor;
    }
    
    @Bean
    public Server rsServer(
            ExceptionHandler exceptionHandler,
            ValidationExceptionMapper validationExceptionMapper,
            JAXBElementProvider jaxbElementProvider,
            JacksonJsonProvider jacksonJsonProvider,
            JAXRSBeanValidationInInterceptor validationInInterceptor,
            JAXRSBeanValidationOutInterceptor validationOutInterceptor
    ) {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setAddress("/retailer");
        endpoint.setServiceBeans(Arrays.asList(retailerResource));
        endpoint.setProviders(Arrays.asList(jacksonJsonProvider, jaxbElementProvider,validationExceptionMapper));
        endpoint.setInInterceptors(Arrays.asList(validationInInterceptor));
        endpoint.setOutInterceptors(Arrays.asList(validationOutInterceptor));
        return endpoint.create();
    }
}
