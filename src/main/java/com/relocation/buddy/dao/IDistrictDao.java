package com.relocation.buddy.dao;

import com.relocation.buddy.entity.District;

import java.util.List;

public interface IDistrictDao {
    public String save(District entity);

    public List<District> list();

    public abstract void delete(Integer id);

    public abstract District update(District district);

    public abstract District findById(Integer id);
}
