package com.relocation.buddy.service.impl;

import com.relocation.buddy.service.IHomeService;
import org.springframework.stereotype.Service;

//@Service
public class HomeServiceImpl implements IHomeService {
    @Override
    public String home() {
        System.out.println("I am responsible.to handle V1 request");
        return "";
    }
}
