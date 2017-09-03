package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by imafan on 2017-08-24.
 */
@Mapper
public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);

}
