package com.ur.registration.service;

import com.ur.registration.model.dto.request.UserRequest;
import com.ur.registration.model.dto.response.UserResponse;

public interface UserService {
    UserResponse create(UserRequest user);
}
