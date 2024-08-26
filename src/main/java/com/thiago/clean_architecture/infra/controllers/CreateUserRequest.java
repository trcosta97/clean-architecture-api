package com.thiago.clean_architecture.infra.controllers;

public record CreateUserRequest(String username, String email, String password) {
}

