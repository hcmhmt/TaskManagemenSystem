package com.simurgh.taskmanagementsystem.controller;

import com.simurgh.taskmanagementsystem.dto.CreateUserRequest;
import com.simurgh.taskmanagementsystem.dto.CreateUserResponse;
import com.simurgh.taskmanagementsystem.dto.RegisterUserRequest;
import com.simurgh.taskmanagementsystem.dto.RegisterUserResponse;
import com.simurgh.taskmanagementsystem.service.IAppUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final IAppUserService appUserService;

    @PostMapping(value = "/create", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<CreateUserResponse> createUser(CreateUserRequest request) {
        return new ResponseEntity<>(appUserService.createUserOperation(request), HttpStatus.OK);
    }

    @PostMapping(value = "/register", produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<RegisterUserResponse> createUser(RegisterUserRequest request) {
        return new ResponseEntity<>(appUserService.registerUserOperation(request), HttpStatus.OK);
    }

}
