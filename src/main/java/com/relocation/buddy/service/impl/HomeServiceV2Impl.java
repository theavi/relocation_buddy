package com.relocation.buddy.service.impl;

import com.relocation.buddy.service.IHomeService;
import org.springframework.stereotype.Service;

@Service
public class HomeServiceV2Impl implements IHomeService {
    @Override
    public String home() {
        System.out.println("I am responsible.to handle V2 request");
        return "";
    }
}
