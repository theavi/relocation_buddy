package com.relocation.buddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Service extends BaseEntity{
    @Id
    private Integer id;
    private String name;
    private String description;
}
