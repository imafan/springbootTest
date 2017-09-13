package com.example.service;

import com.example.entity.Role;

import java.util.List;

/**
 * Created by imafan on 2017-09-12.
 */
public interface RoleService {

    Long save(Role role);

    void update(Role role);

    void delete(Long id);

    List<Role> findAll();

    Role getById(Long id);
}
