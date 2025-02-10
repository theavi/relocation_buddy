package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.IDistrictDao;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.service.IDistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements IDistrictService {
    @Autowired
    private IDistrictDao dao;

    @Override
    public String createDistrict(DistrictDto dto) {
        System.out.println("Create District Service Called");
//        String msg = dao.save(dto.getName());
//        return msg;
        return "Record Save Succes";
    }
}