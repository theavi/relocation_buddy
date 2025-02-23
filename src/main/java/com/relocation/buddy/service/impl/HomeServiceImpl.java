package com.relocation.buddy.service.impl;

import com.relocation.buddy.dao.IHomeDao;
import com.relocation.buddy.service.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements IHomeService {
    @Autowired
    private IHomeDao iHomeDao;

    @Override
    public String home() {
        iHomeDao.home();
        System.out.println("I am responsible.to handle V1 request");
        return "";
    }
}
