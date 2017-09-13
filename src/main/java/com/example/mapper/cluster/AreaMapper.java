package com.example.mapper.cluster;

import com.example.entity.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by imafan on 2017-08-24.
 */
@Mapper
public interface AreaMapper {

   List<Area> findAll();

}
