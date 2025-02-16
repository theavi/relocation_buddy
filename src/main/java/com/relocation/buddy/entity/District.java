package com.relocation.buddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class District extends BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private Integer Id;
    private String name;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}