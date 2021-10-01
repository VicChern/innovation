package com.vicchern.innovationapp.service.impl;

import com.vicchern.innovationapp.entity.IUser;
import com.vicchern.innovationapp.entity.impl.User;
import com.vicchern.innovationapp.exception.UserServiceException;
import com.vicchern.innovationapp.repository.UserRepository;
import com.vicchern.innovationapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<IUser> getAllUsers() throws UserServiceException {

        try {
            final List<? extends IUser> users =(List<User>) userRepository.findAll();
            return (List<IUser>) users;

        } catch (DataAccessException ex) {
            throw new UserServiceException();
        }
    }

    @Override
    public IUser getUser(Long id) throws UserServiceException {
        return userRepository.findById(id).orElseThrow(NoSuchFieldError::new);
    }
}
