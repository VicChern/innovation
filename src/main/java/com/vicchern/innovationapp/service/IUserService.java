package com.vicchern.innovationapp.service;

import com.vicchern.innovationapp.entity.IUser;
import com.vicchern.innovationapp.entity.impl.User;
import com.vicchern.innovationapp.exception.UserServiceException;

import java.util.List;

public interface IUserService {

    List <IUser> getAllUsers() throws UserServiceException;

    IUser getUser(Long id) throws UserServiceException;
}
