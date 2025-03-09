package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.ICityDao;
import com.relocation.buddy.dto.CityDto;
import com.relocation.buddy.entity.City;
import com.relocation.buddy.mapper.CityMapper;
import com.relocation.buddy.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements ICityService {
    @Autowired
    private ICityDao dao;

    @Override
    public String createCity(CityDto dto) {
        System.out.println("Create City Service Called");
        City city = CityMapper.ToEntity(dto);
        return dao.save(city);
    }
}