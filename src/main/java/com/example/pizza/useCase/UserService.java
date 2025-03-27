package com.example.pizza.useCase;

import com.example.pizza.database.UserRepository;
import com.example.pizza.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void updateUser(User user) {
        userRepository.update(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }
}
