package com.example.demokeycloak.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateUserRequest {
    private String email;
    private String password;
    private String firstname;
    private String lastname;
}
