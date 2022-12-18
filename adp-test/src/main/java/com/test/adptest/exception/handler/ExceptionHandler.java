package com.test.adptest.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class ExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidValueException.class)
    public StandardError handleInvalidValueException(InvalidValueException e) {
        return StandardError.builder()
                .status(HttpStatus.BAD_REQUEST)
                .message(e.getMessage())
                .build();
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public StandardError handleGenericException(ResponseStatusException e) {
        return StandardError.builder()
                .status(e.getStatusCode())
                .message(e.getMessage())
                .build();
    }
}
