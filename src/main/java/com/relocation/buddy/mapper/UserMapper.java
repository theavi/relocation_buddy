package com.relocation.buddy.mapper;

import com.relocation.buddy.dto.UserDto;
import com.relocation.buddy.entity.User;

import java.util.Date;

public class UserMapper {
    public static User ToEntity(UserDto dto){
        User user = new User();
        user.setName(dto.getName());
        user.setCreatedBy(1);
        user.setCreatedDate(new Date());
        user.setFirstName(dto.getFirstName());
        user.setMiddleName(dto.getMiddleName());
        user.setSurname(dto.getSurname());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        return user;
    }
}