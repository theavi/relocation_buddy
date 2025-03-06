package com.relocation.buddy.controller;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private IDistrictService districtService;

    @GetMapping("/create")
    public String create(Model model) {
        System.out.println("HTTP GET Initiated for create District");
        model.addAttribute("districtObject", new DistrictDto());
        List<DistrictDto> list = districtService.list();
        model.addAttribute("list", list);
        model.addAttribute("path", "/district/createDistrict");
        model.addAttribute("fragment", "createDistrict");
        return "default";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("districtObject") DistrictDto dto, Model model) {
        System.out.println("HTTP POST Initiated for create District");
        String message = districtService.createDistrict(dto);
        model.addAttribute("districtObject", new DistrictDto());
        model.addAttribute("path", "/district/createDistrict");
        model.addAttribute("fragment", "createDistrict");
        return "default";
    }

    @GetMapping("/list")
    public String list(Model model) {
        System.out.println("HTTP list GET initiated for list District");
        List<DistrictDto> list = districtService.list();
        model.addAttribute("list", list);
        model.addAttribute("path", "/district/listDistrict");
        model.addAttribute("fragment", "listDistrictTbl");
        return "default";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        System.out.println("HTTP DELETE initiated for District");
        return "default";
    }
}