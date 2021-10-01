package com.vicchern.innovationapp.mapper;

import com.vicchern.innovationapp.dto.UserDTO;
import com.vicchern.innovationapp.entity.IUser;
import com.vicchern.innovationapp.entity.impl.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IUserMapper {

    IUserMapper INSTANCE = Mappers.getMapper(IUserMapper.class);

    @Mapping(target = "userEmail",ignore = true)
    UserDTO toUserDto(IUser iUser);

    User toUser(IUser iUser);
}

