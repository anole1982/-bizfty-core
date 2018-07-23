/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icss.regie.retailer.app;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author johns
 */
public class ExceptionHandler implements ExceptionMapper<Throwable> {
    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandler.class);

    public Response toResponse(Throwable exception) {
        Response.Status status;
        status = Response.Status.INTERNAL_SERVER_ERROR;
        logger.error("exception", exception);
        return Response.status(status).header("exception", exception.getClass().getSimpleName()).entity(exception).build();
    }
}
