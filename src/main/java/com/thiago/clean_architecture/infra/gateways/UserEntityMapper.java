package com.thiago.clean_architecture.infra.gateways;

import com.thiago.clean_architecture.domain.entity.User;
import com.thiago.clean_architecture.infra.persistence.UserEntity;

public class UserEntityMapper {

    UserEntity toEntity(User userDomainObject){
        return new UserEntity(
                userDomainObject.username(),
                userDomainObject.email(),
                userDomainObject.password()
        );
    }

    User toDomainObject(UserEntity userEntity){
        return new User(
                userEntity.getUsername(),
                userEntity.getEmail(),
                userEntity.getPassword()
        );
    }

}
