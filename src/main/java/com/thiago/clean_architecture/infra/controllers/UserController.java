package com.thiago.clean_architecture.infra.controllers;

import com.thiago.clean_architecture.application.usecases.CreateUserInteractor;
import com.thiago.clean_architecture.domain.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private CreateUserInteractor createUserInteractor;
    private UserDTOMapper userDTOMapper;

    public UserController (CreateUserInteractor createUserInteractor, UserDTOMapper userDTOMapper){
        this.createUserInteractor = createUserInteractor;
        this.userDTOMapper = userDTOMapper;
    }

    @PostMapping
    CreateUserResponse create(@RequestBody CreateUserRequest request){
        var userBusinessObj = userDTOMapper.toUser(request);
        User user = createUserInteractor.createUser(userBusinessObj);
        return userDTOMapper.toResponse(user);
    }


}
