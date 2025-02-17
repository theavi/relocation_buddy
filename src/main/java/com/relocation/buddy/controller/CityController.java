package com.relocation.buddy.controller;

import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService iCityService;

    @PostMapping("/create")
    @ResponseBody
    public String create (@RequestBody CityDto dto){
        System.out.println("HTTP GET Initiated for create City");
        return iCityService.create(dto);
    }
}
