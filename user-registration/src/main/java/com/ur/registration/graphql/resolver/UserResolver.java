package com.ur.registration.graphql.resolver;

import com.ur.registration.model.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class UserResolver {

    @QueryMapping(name = "user")
    public User getUserById(@Argument UUID id) {
        return null;
    }
}
