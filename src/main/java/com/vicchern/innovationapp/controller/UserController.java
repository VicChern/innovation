package com.vicchern.innovationapp.controller;

import com.vicchern.innovationapp.dto.ListWrapperDTO;
import com.vicchern.innovationapp.dto.UserDTO;
import com.vicchern.innovationapp.entity.IUser;
import com.vicchern.innovationapp.exception.UserServiceException;
import com.vicchern.innovationapp.mapper.IUserMapper;
import com.vicchern.innovationapp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    IUserService userService;

    @Autowired
    public UserController(IUserService IUserService) {
        this.userService = IUserService;
    }

    @GetMapping(path = "/list")
    @ResponseStatus(HttpStatus.OK)
    public ListWrapperDTO<UserDTO> getAllUsers() throws UserServiceException {
        List <IUser> listOfUsers = userService.getAllUsers();
        ListWrapperDTO<UserDTO> userListDto = new ListWrapperDTO<>(listOfUsers
                .stream()
                .map(IUserMapper.INSTANCE::toUserDto)
                .collect(Collectors.toList()));

        return userListDto;
    }

    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUser(@PathVariable String id) throws UserServiceException {

        IUser user = userService.getUser(Long.parseLong(id));
        UserDTO userDTO = IUserMapper.INSTANCE.toUserDto(user);

        return userDTO;
    }
}
