package com.example.pizza.useCase;

import com.example.pizza.database.UserRepository;

public class BrugerService {
    private final UserRepository userRepository;

    public BrugerService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
