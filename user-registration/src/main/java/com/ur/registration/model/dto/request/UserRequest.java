package com.ur.registration.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequest {

    @NotBlank
    @NotNull
    private String firstName;
    private String lastName;
    private String password;
    private String email;
}
