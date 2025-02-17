package com.relocation.buddy.controller;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.IDistrictService;
import com.relocation.buddy.service.impl.DistrictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private IDistrictService districtService;

    @GetMapping("/create")
    public String create(Model model){
        System.out.println("HTTP GET Initiated for create District");
        model.addAttribute("path","/district/createDistrict");
        model.addAttribute("fragment","createDistrict");
     return "default";
    }

    @PostMapping("/create")
    public String create(@RequestBody DistrictDto dto){
        System.out.println("HTTP GET Initiated for create District");
        return districtService.createDistrict(dto);
    }
}