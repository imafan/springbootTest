package com.example.mapper;

import com.example.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by imafan on 2017-08-24.
 */
@Mapper
public interface RoleMapper {

    List<Role> getAll();

    Role getOne(Long id);

    Long insert(Role user);

    void update(Role user);

    void delete(Long id);

}
