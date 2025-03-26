package com.example.pizza.controller;

import com.example.pizza.model.User;
import com.example.pizza.useCase.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUser(Model model) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("goku", "goku@namek.com", "439 East District, Mount Paozu", 5));
        users.add(new User("Walter White", "walter.white5@hotmail.com", "308 Negra Arroyo Lane", 5));
        model.addAttribute("users", users);
        return "user";
    }
}