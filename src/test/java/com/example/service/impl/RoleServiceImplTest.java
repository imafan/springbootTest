package com.example.service.impl;

import com.example.entity.Role;
import com.example.mapper.master.RoleMapper;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by imafan on 2017-09-13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleServiceImplTest extends TestCase {

    @Autowired
    private RoleMapper roleMapper;

    @Test
    public void testSave() throws Exception {

        Role role = new Role();
        role.setRoleName("est");

        System.out.println(roleMapper.insert(role));

    }

    public void testUpdate() throws Exception {

    }

    public void testDelete() throws Exception {

    }

    public void testFindAll() throws Exception {

    }

    public void testGetById() throws Exception {

    }
}