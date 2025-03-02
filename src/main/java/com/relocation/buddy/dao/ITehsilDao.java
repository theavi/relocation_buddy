package com.relocation.buddy.dao;

import com.relocation.buddy.entity.Tehsil;

import java.util.List;

public interface ITehsilDao {
    public Tehsil create(Tehsil tehsil);
    public List<Tehsil> list();
}
