package com.relocation.buddy.dao;

import com.relocation.buddy.entity.Country;

import java.util.List;

public interface ICountryDao {
    public String save(Country entity);

    public List<Country> list();
}
