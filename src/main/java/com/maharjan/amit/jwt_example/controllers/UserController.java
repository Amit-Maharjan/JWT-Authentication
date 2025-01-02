package com.maharjan.amit.jwt_example.controllers;

import com.maharjan.amit.jwt_example.models.User;
import com.maharjan.amit.jwt_example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
