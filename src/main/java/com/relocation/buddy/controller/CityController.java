package com.relocation.buddy.controller;

import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService iCityService;

    @GetMapping("/create")
    public String create(Model model){
        System.out.println("HTTP GET Initiated for create City");
//        CityDto cityDto = new CityDto();
//        cityDto.setName("Swaraj");
        model.addAttribute("cityObject",new CityDto());
        model.addAttribute("path", "/city/createCity");
        model.addAttribute("fragment", "createCity");
        return "default";
    }

    @PostMapping("/create")
    public String create (@ModelAttribute("cityObject") CityDto dto, Model model){
        System.out.println("HTTP GET Initiated for create City");
        iCityService.createCity(dto);
        model.addAttribute("cityObject",new CityDto());
        model.addAttribute("path", "/city/createCity");
        model.addAttribute("fragment", "createCity");
        return "default";
    }
    @GetMapping("/list")
    public String list(Model model){
        System.out.println("HTTP GET initiated for list City");
        model.addAttribute("path", "/city/listCity");
        model.addAttribute("fragment", "listCityTbl");
        return "default";
    }
}
