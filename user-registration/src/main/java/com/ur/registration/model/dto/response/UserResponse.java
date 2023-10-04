package com.ur.registration.model.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class UserResponse {
    protected UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean active;
}
