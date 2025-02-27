package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.IUserDao;
import com.relocation.buddy.dto.UserDto;
import com.relocation.buddy.entity.User;
import com.relocation.buddy.mapper.UserMapper;
import com.relocation.buddy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao iUserDao;

    public String create(UserDto dto){
        User user = UserMapper.ToEntity(dto);
        String msg = iUserDao.create(user);
        return msg;
    }
}