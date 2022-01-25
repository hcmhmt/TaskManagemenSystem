package com.simurgh.taskmanagementsystem.service.impl.auth;

import com.simurgh.taskmanagementsystem.dto.AppUser;
import com.simurgh.taskmanagementsystem.dto.RegisterUserRequest;
import com.simurgh.taskmanagementsystem.dto.RegisterUserResponse;
import com.simurgh.taskmanagementsystem.service.auth.IAuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements IAuthService {

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request){
        return null;
    }

    @Override
    public AppUser fetchLoggedInUser(){
        return null;
    }

    @Override
    public String verifyAccount(String token) {
        return null;
    }


}
