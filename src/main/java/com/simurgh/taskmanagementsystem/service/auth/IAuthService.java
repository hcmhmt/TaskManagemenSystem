package com.simurgh.taskmanagementsystem.service.auth;

import com.simurgh.taskmanagementsystem.dto.*;

public interface IAuthService {

    RegisterUserResponse registerUser(RegisterUserRequest request);

    AppUser fetchLoggedInUser();

    String verifyAccount(String token);

    AuthenticationResponse login(LoginRequest loginRequest);
}
