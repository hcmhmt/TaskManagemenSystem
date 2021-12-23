package com.simurgh.taskmanagementsystem.service.impl;

import com.simurgh.taskmanagementsystem.dto.*;
import com.simurgh.taskmanagementsystem.repository.AppUserRepository;
import com.simurgh.taskmanagementsystem.service.IAppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AppUserService implements IAppUserService {

    private final AppUserRepository appUserRepository;

    @Transactional
    public CreateUserResponse createUserOperation(CreateUserRequest request) {
        // 1. Check isAdminHasPermissionForThisAction
        // 2. Check request (mandatory field)
        // 3. Check isUserBanned
        // 4. Check isUserExist
        // 5. Create contactInformation
        // 6. Create user
        // 7. Build response
        // 8. Return response

        return null;
    }

    @Transactional
    public RegisterUserResponse registerUserOperation(RegisterUserRequest request) {
        // 1. Check request (mandatory field)
        // 2. Check isUserBanned
        // 3. Check isUserExist
        // 4. Create contactInformation
        // 5. Register user
        // 6. Build response
        // 7. Return response

        return null;
    }

    private AppUser createUser(CreateUserRequest request) {
        // 1. Fetch default roles
        // 2. Fetch default permissions
        // 3. Create Customer
        // 4. Build response
        // 5. Return response

        return null;
    }


}
