package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.ICityDao;
import com.relocation.buddy.dao.ICountryDao;
import com.relocation.buddy.dto.CountryDto;
import com.relocation.buddy.entity.Country;
import com.relocation.buddy.mapper.CountryMapper;
import com.relocation.buddy.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements ICountryService {
    @Autowired
    private ICountryDao dao;


    @Override
    public String createCountry(CountryDto dto) {
        System.out.println("Create Country Service Called");
        Country country = CountryMapper.ToEntity(dto);
        return dao.save(country);
    }
}
