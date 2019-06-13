package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Por1;

public interface Por1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Por1 record);

    int insertSelective(Por1 record);

    Por1 selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Por1 record);

    int updateByPrimaryKey(Por1 record);
}