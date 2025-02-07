package com.relocation.buddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User extends  BaseEntity {
    @Id
    private Integer id;
    private String name;
    private String firstName;
    private String middleName;
    private String surname;
    private String username;
    private String password;
}
