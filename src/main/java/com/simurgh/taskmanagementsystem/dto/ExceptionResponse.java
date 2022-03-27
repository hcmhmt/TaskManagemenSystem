package com.simurgh.taskmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Data
@AllArgsConstructor
public class ExceptionResponse {

    private final HttpStatus status;
    private final String message;
    private final Instant timestamp;

}
