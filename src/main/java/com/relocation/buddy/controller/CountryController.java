package com.relocation.buddy.controller;

import com.relocation.buddy.dto.CountryDto;
import com.relocation.buddy.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private ICountryService countryService;

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestBody CountryDto dto) {
        System.out.println("HTTP GET Initiated for create country");
        String msg = countryService.createCountry(dto.getName());
        return msg;
    }
}
