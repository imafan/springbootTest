package com.example.entity;

import java.io.Serializable;

/**
 * Created by imafan on 2017-09-12.
 */
public class Role implements Serializable {

    private Long id;

    private String roleName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
