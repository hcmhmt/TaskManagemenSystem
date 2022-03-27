package com.simurgh.taskmanagementsystem.service.impl.auth;

import com.simurgh.taskmanagementsystem.dto.*;
import com.simurgh.taskmanagementsystem.security.TokenProvider;
import com.simurgh.taskmanagementsystem.service.auth.IAuthService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements IAuthService {

    private final AuthenticationManager authenticationManager;
    private final TokenProvider tokenProvider;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        return null;
    }

    @Override
    public AppUser fetchLoggedInUser() {
        return null;
    }

    @Override
    public String verifyAccount(String token) {
        return null;
    }

    @Override
    public AuthenticationResponse login(LoginRequest loginRequest) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUserName(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authenticate);
        String token = tokenProvider.generateToken(authenticate);
        // TODO: AuthEntity will created for token operations. This structure will change

        return new AuthenticationResponse(token, loginRequest.getUserName());
    }

}
