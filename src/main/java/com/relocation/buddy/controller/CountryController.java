package com.relocation.buddy.controller;

import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.dto.CountryDto;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.ICityService;
import com.relocation.buddy.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private ICountryService iCountryService;

    @GetMapping("/create")
    public String create(Model model){
        System.out.println("HTTP GET Initiated for create Country");
        model.addAttribute("countryObject",new CountryDto());
        model.addAttribute("path", "/country/createCountry");
        model.addAttribute("fragment", "createCountry");
        return "default";
    }

    @PostMapping("/create")
    public String create (@ModelAttribute("countryObject") CountryDto dto, Model model){
        System.out.println("HTTP GET Initiated for create Country");
        iCountryService.createCountry(dto);
        model.addAttribute("countryObject",new CountryDto());
        model.addAttribute("path", "/country/createCountry");
        model.addAttribute("fragment", "createCountry");
        return "default";
    }

    @GetMapping("/list")
    public String list(Model model){
        System.out.println("HTTP GET initiated for list Country");
        List<CountryDto> list = iCountryService.list();
        model.addAttribute("list",list);
        model.addAttribute("path", "/country/listCountry");
        model.addAttribute("fragment", "listCountryTbl");
        return "default";
    }

}