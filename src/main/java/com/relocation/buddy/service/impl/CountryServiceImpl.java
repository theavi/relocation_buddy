package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.ICityDao;
import com.relocation.buddy.dao.ICountryDao;
import com.relocation.buddy.dto.CountryDto;
import com.relocation.buddy.dto.DistrictDto;
import com.relocation.buddy.entity.Country;
import com.relocation.buddy.entity.District;
import com.relocation.buddy.mapper.CountryMapper;
import com.relocation.buddy.mapper.DistrictMapper;
import com.relocation.buddy.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<CountryDto> list() {
        List<Country> list = dao.list();
        List<CountryDto> listDto=new ArrayList<>();
        for (Country country:list){
            listDto.add(CountryMapper.toDto(country));
        }
        return listDto;
    }

}
