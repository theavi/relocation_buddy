package com.relocation.buddy.controller;

import com.relocation.buddy.dto.TehsilDto;
import com.relocation.buddy.service.ITehsilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tehsil")
public class TehsilController {

    @Autowired
    private ITehsilService iTehsilService;

    @PostMapping("/create")
    @ResponseBody
    public TehsilDto create(@RequestBody TehsilDto dto) {
        System.out.println("HTTP post initiated for create Tehsil");
        return iTehsilService.create(dto);
    }

}
