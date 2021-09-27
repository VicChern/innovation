package com.vicchern.innovationapp.controller;

import com.vicchern.innovationapp.entity.User;
import com.vicchern.innovationapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/list")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
