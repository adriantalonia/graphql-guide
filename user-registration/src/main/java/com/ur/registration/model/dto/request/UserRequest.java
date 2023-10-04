package com.ur.registration.model.dto.request;

import lombok.Data;

@Data
public class UserRequest {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
