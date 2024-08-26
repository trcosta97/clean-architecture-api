package com.thiago.clean_architecture.infra.persistence;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Data
@Getter
@Setter
@Entity
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id;
    private String username;
    private String email;
    private String password;

    public UserEntity(String name, String email, String password) {
        this.username = name;
        this.email = email;
        this.password = password;
    }
}
