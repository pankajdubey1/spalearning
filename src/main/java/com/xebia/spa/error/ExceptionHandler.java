package com.xebia.spa.error;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Provider
public class ExceptionHandler implements ExceptionMapper<Exception> {
	private static Logger log = LoggerFactory.getLogger(ExceptionHandler.class);

	@Override
	public Response toResponse(Exception exception) {
		log.error("Runtime  Exception:", exception);
		return Response.status(Status.INTERNAL_SERVER_ERROR)
				.entity(exception.getClass() + ": " + exception.getMessage()).build();
	}
}
