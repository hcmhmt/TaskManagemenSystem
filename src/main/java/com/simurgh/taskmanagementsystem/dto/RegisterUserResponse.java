package com.simurgh.taskmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {

    private Long userId;
    private String firstName;
    private String lastName;
    private String userName;

}
