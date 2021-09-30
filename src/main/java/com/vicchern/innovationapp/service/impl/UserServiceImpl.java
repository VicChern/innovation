package com.vicchern.innovationapp.service.impl;

import com.vicchern.innovationapp.entity.impl.User;
import com.vicchern.innovationapp.exception.UserServiceException;
import com.vicchern.innovationapp.repository.UserRepository;
import com.vicchern.innovationapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() throws UserServiceException {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Object getUser(Long id) throws UserServiceException{
        return userRepository.findById(id);
    }


}
