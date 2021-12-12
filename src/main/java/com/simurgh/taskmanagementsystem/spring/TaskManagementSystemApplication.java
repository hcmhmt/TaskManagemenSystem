package com.simurgh.taskmanagementsystem.spring;

import com.simurgh.taskmanagementsystem.entity.AppUserEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.simurgh.taskmanagementsystem")
@ComponentScan(basePackageClasses = AppUserEntity.class)
@EntityScan(basePackages = "com.simurgh.taskmanagementsystem.entity")
@EnableJpaRepositories(value = "com.simurgh.taskmanagementsystem.repository")
@SpringBootApplication
public class TaskManagementSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagementSystemApplication.class, args);
    }

}
