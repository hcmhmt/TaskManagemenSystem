package com.simurgh.taskmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {

    private String firstName;
    private String secondName;
    private String nickName;
    private String lastName;

}
