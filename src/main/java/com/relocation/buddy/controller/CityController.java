package com.relocation.buddy.controller;

import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.dto.CountryDto;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        List<CityDto> list = iCityService.list();
        model.addAttribute("list",list);
        model.addAttribute("path", "/city/listCity");
        model.addAttribute("fragment", "listCityTbl");
        return "default";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        System.out.println("HTTP DELETE initiated for City");
        iCityService.delete(id);
        model.addAttribute("cityObject", new CityDto());
        List<CityDto> list = iCityService.list();
        model.addAttribute("list", list);
        model.addAttribute("path", "/city/createDistrict");
        model.addAttribute("fragment", "createDistrict");
        return "default";
    }
}
