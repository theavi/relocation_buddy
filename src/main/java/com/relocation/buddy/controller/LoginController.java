package com.relocation.buddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/v1/login")
    @ResponseBody
    public String login() {
        System.out.println("Avinash is handeling ...");
        return "login";
    }

    @GetMapping("/v1/logout")
    @ResponseBody
    public String logout() {
        System.out.println("Amol is handelling ...");
        return "logout";
    }
}
