package com.simurgh.taskmanagementsystem.config;

import com.simurgh.taskmanagementsystem.dto.ExceptionResponse;
import com.simurgh.taskmanagementsystem.exceptions.SimurgException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler {

    @ExceptionHandler({ SimurgException.class })
    protected ResponseEntity<ExceptionResponse> handleApiException(SimurgException ex) {
        return new ResponseEntity(new ExceptionResponse(ex.getHttpStatus(), ex.getMessage(), Instant.now()), ex.getHttpStatus());
    }

}
