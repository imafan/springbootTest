package com.example.service.impl;

import com.example.entity.Role;
import com.example.mapper.RoleMapper;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by imafan on 2017-09-12.
 */
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Long save(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public Long update(Role role) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public Role getById(Long id) {
        return null;
    }
}
