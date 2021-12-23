package com.simurgh.taskmanagementsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponse {

    private Long id;
    private String firstName;
    private String secondName;
    private String nickName;
    private String lastName;

}
