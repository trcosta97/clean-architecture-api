package com.thiago.clean_architecture.infra.gateways;

import com.thiago.clean_architecture.application.gateways.UserGateway;
import com.thiago.clean_architecture.domain.entity.User;
import com.thiago.clean_architecture.infra.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {

    private UserRepository userRepository;
    private UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User userDomainObject) {
        var userEntity = userEntityMapper.toEntity(userDomainObject);
        userRepository.save(userEntity);
        return userEntityMapper.toDomainObject(userEntity);
    }
}
