package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Opor;

public interface OporMapper {
    int deleteByPrimaryKey(Integer oporid);

    int insert(Opor record);

    int insertSelective(Opor record);

    Opor selectByPrimaryKey(Integer oporid);

    int updateByPrimaryKeySelective(Opor record);

    int updateByPrimaryKey(Opor record);
}