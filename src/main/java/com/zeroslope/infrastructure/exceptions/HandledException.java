package com.zeroslope.infrastructure.exceptions;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;

public class HandledException extends Exception {

	private ExceptionType exceptionType;
	private HttpStatus httpStatus;
    private HashMap<ExceptionType, String> innerExceptions = new HashMap<ExceptionType, String>();
    
	HandledException (ExceptionType exceptionType, String message) {
		super(message);
		this.exceptionType = exceptionType;
		this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
	}
	
	HandledException (ExceptionType exceptionType, String message, HttpStatus httpStatus) {
		super(message);
		this.exceptionType = exceptionType;
		this.httpStatus = httpStatus;
	}

	public HashMap<ExceptionType, String> getInnerExceptions() {
		return innerExceptions;
	}
	
	public void AddInnerException(HandledException ex) {
		innerExceptions.put(ex.getExceptionType(), ex.getMessage());
	}

	public void AddInnerException(Exception ex) {
		innerExceptions.put(ExceptionType.GENERAL, ex.getMessage());
	}
	
	public ExceptionType getExceptionType() {
		return exceptionType;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public HttpStatus calculateHttpStatus() {
		switch(this.exceptionType) {

			case VALIDATION:
				return HttpStatus.BAD_REQUEST;

			case AUTHENTICATION:
				return HttpStatus.UNAUTHORIZED;

			case SECURITY:
				return HttpStatus.FORBIDDEN;

			default:
				return HttpStatus.INTERNAL_SERVER_ERROR;
		}
	}
}