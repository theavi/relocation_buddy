package com.relocation.buddy.controller;

import com.relocation.buddy.service.IHomeService;
import com.relocation.buddy.service.impl.HomeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IHomeService homeService;

    @GetMapping
    public String homeV1() {
        System.out.println("HTTP GET home initiated V1");
        return "home";
    }

}
