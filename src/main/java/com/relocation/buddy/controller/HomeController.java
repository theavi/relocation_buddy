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

    @GetMapping("/v1/test")
    @ResponseBody
    public String homeV1() {
        System.out.println("HTTP GET home initiated V1");
        homeService.home();
        return "home V1";
    }

    @GetMapping("/v2/test")
    @ResponseBody
    public String homeV2() {
        System.out.println("HTTP GET home initiated V2");
        return "home V2";
    }
}
