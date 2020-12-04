//package com.zeroslope.infrastructure.exceptions;
//
//import java.lang.invoke.MethodHandles;
//import org.slf4j.*;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.context.request.ServletWebRequest;
//
//@ControllerAdvice
//@Order(Ordered.LOWEST_PRECEDENCE)
//public class GlobalErrorHandler {
//    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
//
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(CustomNotFoundException.class)
//    public void handleNotFoundException(final Exception exception) {
//        logException(exception);
//    }
//
//    @ResponseStatus(HttpStatus.FORBIDDEN)
//    @ExceptionHandler(CustomForbiddenException.class)
//    public void handleForbiddenException(final Exception exception) {
//        logException(exception);
//    }
//
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler({ HandledException.class, Exception.class })
//    public void handleGeneralException(final HandledException exception) {
//        logException(exception);
//    }
//
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @ExceptionHandler(Exception.class)
//    public void handleGeneralException(final Exception exception) {
//        logException(exception);
//    }
//
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    @ExceptionHandler({ CustomBadRequestException.class, IllegalArgumentException.class })
//    @ResponseBody
//    public String handleBadRequestException(final Exception exception) {
//        logException(exception);
//        return exception.getMessage();
//    }
//
//    private void logException(final Exception exception) {
//
//    }
//
//}
