/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.app;

import com.icss.regie.api.beans.BusinessException;
import com.icss.regie.api.beans.Reason;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.ValidationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.ext.ExceptionMapper;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;
import org.apache.cxf.validation.ResponseConstraintViolationException;

/**
 * bean validation
 *
 * @author 张森
 */
public class ValidationExceptionMapper implements ExceptionMapper<ValidationException> {

    @Override
    public Response toResponse(ValidationException exception) {
        Response.Status errorStatus = Response.Status.INTERNAL_SERVER_ERROR;
        if (exception instanceof ConstraintViolationException) {
            final ConstraintViolationException constraint = (ConstraintViolationException) exception;
            BusinessException businessException = new BusinessException();
            for (final ConstraintViolation< ? > violation: constraint.getConstraintViolations()) {
                Reason reason = new Reason();
                reason.setCode(violation.getPropertyPath().toString());
                reason.setDescript(violation.getMessage());
                if(violation.getInvalidValue()!=null){
                    reason.setTraceCode(violation.getInvalidValue().toString());
                }
                reason.addExtension("RootBeanClass",violation.getRootBeanClass().getSimpleName());
                businessException.addReason(reason);
            }
            if (!(constraint instanceof ResponseConstraintViolationException)) {
                errorStatus = Response.Status.BAD_REQUEST;
            }
            return Response.status(errorStatus).entity(businessException).build();
        }else {
            return Response.status(errorStatus).entity(new BusinessException(exception)).build();
        }
    }
}
