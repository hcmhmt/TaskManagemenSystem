package com.simurgh.taskmanagementsystem.repository;

import com.simurgh.taskmanagementsystem.entity.AppUserEntity;

public interface AppUserRepository extends BaseJpaRepository<AppUserEntity, Long> {

    AppUserEntity findByUsername(String username);

}
