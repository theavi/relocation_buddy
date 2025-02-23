package com.relocation.buddy.controller;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1/district")
public class DistrictController {
    @Autowired
    private IDistrictService districtService;

    @GetMapping("/create")
    public String create(Model model) {
        System.out.println("HTTP GET Initiated for create District");
        model.addAttribute("districtObject",new DistrictDto());
        model.addAttribute("path", "/district/createDistrict");
        model.addAttribute("fragment", "createDistrict");
        return "default";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("districtObject") DistrictDto dto, Model model) {
        System.out.println("HTTP POST Initiated for create District");
        String message = districtService.createDistrict(dto);
        model.addAttribute("districtObject",new DistrictDto());
        model.addAttribute("path", "/district/createDistrict");
        model.addAttribute("fragment", "createDistrict");
        return "default";
    }

    @GetMapping("/list")
    public String list(Model model){
        System.out.println("HTTP GET initiated for list District");
        model.addAttribute("path", "/district/listDistrict");
        model.addAttribute("fragment", "listDistrictTbl");
        return "default";
    }
}