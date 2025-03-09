package com.relocation.buddy.dao;

import com.relocation.buddy.entity.City;
import com.relocation.buddy.entity.Country;

import java.util.List;

public interface ICityDao {
    public String save(City entity);

    public List<City> list();

    public abstract void delete(Integer id);

}
