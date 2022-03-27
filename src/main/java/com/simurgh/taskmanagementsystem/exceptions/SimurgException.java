package com.simurgh.taskmanagementsystem.exceptions;

import org.springframework.http.HttpStatus;

public class SimurgException extends RuntimeException {

    private HttpStatus httpStatus;

    public SimurgException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SimurgException(String exMessage) {
        super(exMessage);
        this.httpStatus = HttpStatus.BAD_REQUEST;
    }

    public SimurgException(String exMessage, HttpStatus httpStatus) {
        super(exMessage);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
