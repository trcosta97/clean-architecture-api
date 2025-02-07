package com.thiago.clean_architecture.infra.controllers;

import com.thiago.clean_architecture.domain.entity.User;

public class UserDTOMapper {
    CreateUserResponse toResponse (User user){
        return new CreateUserResponse(user.username(), user.email());
    }

    User toUser (CreateUserRequest request){
        return new User(request.username(), request.email(), request.password());
    }
}
