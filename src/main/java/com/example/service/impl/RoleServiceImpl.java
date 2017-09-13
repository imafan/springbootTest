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
    public void update(Role role) {
        roleMapper.update(role);
    }

    @Override
    public void delete(Long id) {
        roleMapper.delete(id);
    }

    @Override
    public List<Role> findAll() {
        return roleMapper.getAll();
    }

    @Override
    public Role getById(Long id) {
        return roleMapper.getOne(id);
    }
}
