package com.relocation.buddy.controller;

import com.relocation.buddy.dto.TehsilDto;
import com.relocation.buddy.service.ITehsilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/tehsil")
public class TehsilController {

    @Autowired
    private ITehsilService iTehsilService;

    @GetMapping("/create")
    public String create(Model model) {
        System.out.println("HTTP GET Initiated for create Tehsil");
        model.addAttribute("tehsilObject", new TehsilDto());
        model.addAttribute("path", "/tehsil/createTehsil");
        model.addAttribute("fragment", "createTehsil");
        return "default";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute TehsilDto dto, Model model) {
        System.out.println("HTTP post initiated for create Tehsil");
        TehsilDto saveTehsil = iTehsilService.create(dto);
        model.addAttribute("tehsilObject", new TehsilDto());
        model.addAttribute("path", "/tehsil/createTehsil");
        model.addAttribute("fragment", "createTehsil");
        return "default";
    }

    @GetMapping("/list")
    public String list(Model model) {
        System.out.println("HTTPlist GET initiated for list tehsil");
        List<TehsilDto> list = iTehsilService.list();
        model.addAttribute("list", list);
        model.addAttribute("path", "/tehsil/listTehsil");
        model.addAttribute("fragment", "listTehsilTbl");
        return "default";
    }

}
