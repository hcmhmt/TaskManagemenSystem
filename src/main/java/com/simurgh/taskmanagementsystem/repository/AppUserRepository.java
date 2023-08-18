package com.simurgh.taskmanagementsystem.repository;

import com.simurgh.taskmanagementsystem.entity.ApplicationUserEntity;

public interface AppUserRepository extends BaseJpaRepository<ApplicationUserEntity, Long> {

    ApplicationUserEntity findByUsername(String username);

    ApplicationUserEntity findByUsernameOrEmailOrPhone(String username, String email, String phoneNumber);

}
