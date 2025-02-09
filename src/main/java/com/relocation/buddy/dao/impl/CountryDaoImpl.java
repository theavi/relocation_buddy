package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.ICountryDao;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDaoImpl implements ICountryDao {
    @Override
    public String save(String name) {
        System.out.println("create country DAO called.");
        return "Record Save successfully";
    }
}
