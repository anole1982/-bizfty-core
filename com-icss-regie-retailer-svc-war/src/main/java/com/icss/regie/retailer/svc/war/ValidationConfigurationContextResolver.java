package com.icss.regie.retailer.svc.war;
//
//import javax.ws.rs.container.ResourceContext;
//import javax.ws.rs.core.Context;
//import javax.ws.rs.ext.ContextResolver;
//
//import org.glassfish.jersey.server.validation.ValidationConfig;
//import org.glassfish.jersey.server.validation.internal.InjectingConstraintValidatorFactory;
//
//public class ValidationConfigurationContextResolver implements ContextResolver<ValidationConfig> {
//
//	@Context
//	private ResourceContext resourceContext;
//	
//	public ValidationConfig getContext(final Class<?> type) {
//	 return new ValidationConfig().constraintValidatorFactory(resourceContext.getResource(InjectingConstraintValidatorFactory.class));
//	 }
//
//}
