package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.ICountryDao;
import com.relocation.buddy.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    private ICountryDao dao;

    @Override
    public String createCountry(String name) {
        System.out.println("Create country service called");
        String msg = dao.save(name);
        return msg;
    }
}
