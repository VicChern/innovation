package com.vicchern.innovationapp.controller;

import com.vicchern.innovationapp.entity.User;
import com.vicchern.innovationapp.exception.UserServiceException;
import com.vicchern.innovationapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers() throws UserServiceException {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Object getUser(@PathVariable String id) throws UserServiceException {
        return  userService.getUser(Long.parseLong(id));
    }
}
