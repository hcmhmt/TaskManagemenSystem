package com.simurgh.taskmanagementsystem.service.auth;

import com.simurgh.taskmanagementsystem.dto.AppUser;

public interface IAuthService {

    AppUser fetchLoggedInUser();

}
