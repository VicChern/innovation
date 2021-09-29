package com.vicchern.innovationapp.service;

import com.vicchern.innovationapp.entity.User;
import com.vicchern.innovationapp.exception.UserServiceException;

import java.util.List;

public interface UserService {

    List <User> getAllUsers() throws UserServiceException;

    Object getUser(Long id) throws UserServiceException;
}
