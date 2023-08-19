package com.simurgh.taskmanagementsystem.controller;

import com.simurgh.taskmanagementsystem.dto.AuthenticationResponse;
import com.simurgh.taskmanagementsystem.dto.LoginRequest;
import com.simurgh.taskmanagementsystem.dto.RegisterUserRequest;
import com.simurgh.taskmanagementsystem.dto.RegisterUserResponse;
import com.simurgh.taskmanagementsystem.service.auth.IAuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final IAuthService authService;

    public AuthController(IAuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/user/register")
    public ResponseEntity<RegisterUserResponse> registerUser(RegisterUserRequest request) {
        RegisterUserResponse response = authService.registerUser(request);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("accountVerification/{token}")
    public ResponseEntity verifyAccount(@PathVariable String token) {
        return ResponseEntity.ok(authService.verifyAccount(token));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody LoginRequest loginRequest) {
        return new ResponseEntity(authService.login(loginRequest), HttpStatus.OK);
    }

}
