package com.simurgh.taskmanagementsystem.service.impl;

import com.simurgh.taskmanagementsystem.dto.*;
import com.simurgh.taskmanagementsystem.entity.ApplicationUserEntity;
import com.simurgh.taskmanagementsystem.exceptions.SimurgException;
import com.simurgh.taskmanagementsystem.repository.AppUserRepository;
import com.simurgh.taskmanagementsystem.service.IAppUserService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.simurgh.taskmanagementsystem.utility.GeneralEnum.Status.UserActive;
import static com.simurgh.taskmanagementsystem.utility.GeneralEnum.Status.UserBanned;
import static com.simurgh.taskmanagementsystem.utility.GeneralEnum.Type.GeneralUser;

@Service
@AllArgsConstructor
public class AppUserService implements IAppUserService {

    private final AppUserRepository appUserRepository;
    private final PasswordEncoder passwordEncoder;

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

        // 1. Check request
        requestValidations(request);

        // 5. Create contactInformation -> TODO

        // Todo: Dto to Entity Map with MapStruct
        ApplicationUserEntity appUserEntity = buildAppUserEntityByRegisterUserRequest(request);

        // 6. Register user
        appUserEntity = appUserRepository.save(appUserEntity);

        // 7. Build and Return response
        return buildRegisterUserResponse(appUserEntity);
    }

    private RegisterUserResponse buildRegisterUserResponse(ApplicationUserEntity appUserEntity) {
        RegisterUserResponse response = new RegisterUserResponse();
        response.setUserId(appUserEntity.getApplicationUserId());
//        response.setFirstName(appUserEntity.getName());
//        response.setLastName(appUserEntity.getSurname());
        response.setUserName(appUserEntity.getUsername());

        return response;
    }

    private void requestValidations(RegisterUserRequest request) {

        // 2. Check mandatory fields
        checkMandatoryFields(request);

        // 3. Check isUserExist
        ApplicationUserEntity userEntity = appUserRepository.findByUsernameOrEmailOrPhone(
                request.getUserName(),
                request.getEmail(),
                request.getPhoneNumber());

        if (userEntity != null) {
            /* TODO: User might be delete himself. So we must check that informations
             * for now we check just user is banned */

            // 4. Check isUserBanned
            if (userEntity.getStatusEntity().getStatusId().equals(UserBanned.getStatusId())) {
                throw new SimurgException("You are banned!");
            }

            throw new SimurgException("Cannot register with this username/email/phoneNumber");
        }

    }

    private void checkMandatoryFields(RegisterUserRequest request) {
        if (request.getFirstName() == null) {
            throw new SimurgException("FirstName cannot be null!");
        } else if (request.getLastName() == null) {
            throw new SimurgException("LastName cannot be null!");
        } else if (request.getPhoneNumber() == null) {
            throw new SimurgException("PhoneNumber cannot be null!");
        } else if (request.getPassword() == null) {
            throw new SimurgException("Password cannot be null!");
        } else if (request.getUserName() == null) {
            throw new SimurgException("UserName cannot be null!");
        }
    }

    private ApplicationUserEntity buildAppUserEntityByRegisterUserRequest(RegisterUserRequest request) {
        ApplicationUserEntity appUserEntity = new ApplicationUserEntity();
//        appUserEntity.setName(request.getFirstName());
        appUserEntity.setUsername(request.getUserName());
        appUserEntity.setPassword(passwordEncoder.encode(request.getPassword()));
        appUserEntity.setEmail(request.getEmail());
//        appUserEntity.setPhone(request.getPhoneNumber());
        appUserEntity.setStId(UserActive.getStatusId());
//        appUserEntity.setUserTypeId(GeneralUser.getTypeId());

        return appUserEntity;
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
