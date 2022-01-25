package com.simurgh.taskmanagementsystem.service.auth;

import com.simurgh.taskmanagementsystem.dto.AppUser;
import com.simurgh.taskmanagementsystem.dto.RegisterUserRequest;
import com.simurgh.taskmanagementsystem.dto.RegisterUserResponse;

public interface IAuthService {

    RegisterUserResponse registerUser(RegisterUserRequest request);

    AppUser fetchLoggedInUser();

    String verifyAccount(String token);

}
