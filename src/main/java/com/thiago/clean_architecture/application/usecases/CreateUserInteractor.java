package com.thiago.clean_architecture.application.usecases;

import com.thiago.clean_architecture.application.gateways.UserGateway;
import com.thiago.clean_architecture.domain.entity.User;

public class CreateUserInteractor {
    private UserGateway userGateway;

    public CreateUserInteractor(UserGateway userGateway){
        this.userGateway = userGateway;
    }

    public User createUser(User user){
        return userGateway.createUser(user);
    }

}
