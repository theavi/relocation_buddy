package com.relocation.buddy.dao.impl;

import com.relocation.buddy.dao.IHomeDao;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDaoImpl implements IHomeDao{
    @Override
    public String home() {
        System.out.println("I am in DAO");
        return "";
    }
}
