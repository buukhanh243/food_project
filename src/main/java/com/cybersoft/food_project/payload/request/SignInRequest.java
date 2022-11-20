package com.cybersoft.food_project.payload.request;

import lombok.Data;

@Data
public class SignInRequest {
    private String username;
    private String password;
}