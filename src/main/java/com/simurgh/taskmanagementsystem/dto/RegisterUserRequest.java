package com.simurgh.taskmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRequest {

    private String firstName;
    private String secondName;
    private String nickName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private String password;
    private String email;

}
