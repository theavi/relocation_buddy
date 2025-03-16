package com.relocation.buddy.controller;

import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.dto.RoleDto;
import com.relocation.buddy.entity.Role;
import com.relocation.buddy.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;

    @GetMapping("/create")
    public String create(Model model) {
        System.out.println("HTTP GET Initiated for create Role");
        model.addAttribute("roleObject", new RoleDto());
        List<RoleDto> list = iRoleService.getList();
        model.addAttribute("list", list);
        model.addAttribute("path", "/role/createRole");
        model.addAttribute("fragment", "createRole");
        return "default";
    }

    @PostMapping("/createRole")
    public String create(@ModelAttribute RoleDto roleDto, Model model){
        System.out.println("HTTP POST Initiated for create Role");
        String message = iRoleService.createRole(roleDto);
        return "redirect:/role/createRole";
    }

    @GetMapping("/list")
    public String list(Model model) {
        System.out.println("HTTP list GET initiated for list District");
        List<RoleDto> list = iRoleService.getList();
        model.addAttribute("list", list);
        model.addAttribute("path", "/role/listRole");
        model.addAttribute("fragment", "listRoleTbl");
        return "default";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id, Model model) {
        System.out.println("HTTP DELETE initiated for Role");
        iRoleService.delete(id);
        model.addAttribute("roleObject", new RoleDto());
        List<RoleDto> list = iRoleService.getList();
        model.addAttribute("list", list);
        model.addAttribute("path", "/role/deleteRole");
        model.addAttribute("fragment", "createRole");
        return "default";
    }

    @PutMapping("/update")
    @ResponseBody
    public RoleDto update(@RequestBody RoleDto dto) {
        System.out.println("HTTP PUT initiated for District");
        return iRoleService.update(dto);
    }

}
