package com.zeroslope.infrastructure.exceptions;

import java.util.HashMap;
import java.util.Map;

public class HandledResponseModel {

    private final String defaultError = "A server error has occurred.";
    private String message;
    private HashMap<String, String> errors = new HashMap<String, String>();
    
    HandledResponseModel(HandledException ex) {
        this.message = defaultError;
        this.errors.put(ex.getExceptionType().toString(), ex.getMessage());
        
        HashMap<ExceptionType, String> innerExceptions = ex.getInnerExceptions();
        for (Map.Entry<ExceptionType, String> entry : innerExceptions.entrySet()) {
            ExceptionType exceptionType = entry.getKey();
            String message = entry.getValue();
            errors.put(exceptionType.toString(), message);
        }
    }

    HandledResponseModel(Exception ex) {
        this.message = defaultError;
        this.errors.put(ExceptionType.GENERAL.toString(), ex.getMessage());
    }
}