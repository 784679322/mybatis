package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.ServeType;

public interface ServeTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ServeType record);

    int insertSelective(ServeType record);

    ServeType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ServeType record);

    int updateByPrimaryKey(ServeType record);
}