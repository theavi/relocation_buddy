package com.relocation.buddy.controller;

import com.relocation.buddy.dto.ServiceDto;
import com.relocation.buddy.service.IRLBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private IRLBService irlbService;

    @GetMapping("/create")
    public String create(Model model) {
        System.out.println("HTTP get initiated for  create service");
        model.addAttribute("serviceObject", new ServiceDto());
        model.addAttribute("path", "/rlbservice/createRlbService");
        model.addAttribute("fragment", "createRlbService");
        return "default";
    }
}
