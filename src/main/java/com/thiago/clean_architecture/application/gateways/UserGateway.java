package com.thiago.clean_architecture.application.gateways;

import com.thiago.clean_architecture.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
