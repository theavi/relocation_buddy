package com.relocation.buddy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Role extends BaseEntity {

     @Id
     private Integer roleId;

     private String roleName;


     public Integer getRoleId() {
          return roleId;
     }

     public void setRoleId(Integer roleId) {
          this.roleId = roleId;
     }

     public String getRoleName() {
          return roleName;
     }

     public void setRoleName(String roleName) {
          this.roleName = roleName;
     }
}
