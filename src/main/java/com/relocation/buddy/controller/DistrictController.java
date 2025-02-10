package com.relocation.buddy.controller;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.IDistrictService;
import com.relocation.buddy.service.impl.DistrictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private IDistrictService districtService;

    @PostMapping("/create")
    @ResponseBody
    public String create(@RequestBody DistrictDto dto){
        System.out.println("HTTP GET Initiated for create District");
        return districtService.createDistrict(dto);
    }
}