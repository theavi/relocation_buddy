package com.relocation.buddy.controller;

import com.relocation.buddy.dto.UserDto;
import com.relocation.buddy.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("/create")
    @ResponseBody
    public String user(@RequestBody UserDto dto){
        System.out.println("User Get it");
        return iUserService.create(dto);
    }
}