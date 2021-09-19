package com.simurgh.taskmanagementsystem.repository;

import com.simurgh.taskmanagementsystem.entity.StatusEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StatusRepository extends BaseJpaRepository<StatusEntity, Long> {
}
