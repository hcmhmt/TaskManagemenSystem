package com.simurgh.taskmanagementsystem.service;

import com.simurgh.taskmanagementsystem.dto.CreateUserRequest;
import com.simurgh.taskmanagementsystem.dto.CreateUserResponse;
import com.simurgh.taskmanagementsystem.dto.RegisterUserRequest;
import com.simurgh.taskmanagementsystem.dto.RegisterUserResponse;

public interface IAppUserService {

    CreateUserResponse createUserOperation(CreateUserRequest request);

    RegisterUserResponse registerUserOperation(RegisterUserRequest request);

}
