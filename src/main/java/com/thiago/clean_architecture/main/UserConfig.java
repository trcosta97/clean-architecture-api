package com.thiago.clean_architecture.main;

import com.thiago.clean_architecture.application.gateways.UserGateway;
import com.thiago.clean_architecture.application.usecases.CreateUserInteractor;
import com.thiago.clean_architecture.infra.controllers.UserDTOMapper;
import com.thiago.clean_architecture.infra.gateways.UserEntityMapper;
import com.thiago.clean_architecture.infra.gateways.UserRepositoryGateway;
import com.thiago.clean_architecture.infra.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserInteractor createUserCase(UserGateway userGateway){
        return new CreateUserInteractor(userGateway);
    }

    @Bean
    UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper){
        return new UserRepositoryGateway(userRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper userEntityMapper(){
        return new UserEntityMapper();
    }

    @Bean
    UserDTOMapper userDTOMapper(){
        return new UserDTOMapper();
    }
}
