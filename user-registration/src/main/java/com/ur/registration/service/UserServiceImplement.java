package com.ur.registration.service;

import com.ur.registration.model.dto.request.UserRequest;
import com.ur.registration.model.dto.response.UserResponse;
import com.ur.registration.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImplement implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest user) {
        return null;
    }
}
