package com.example.entity;

import java.io.Serializable;

/**
 * Created by imafan on 2017-09-12.
 */
public class Permission implements Serializable {

    private Long id;
    private String permissionName;
    private Long roleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
