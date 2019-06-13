package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Warehouse;

public interface WarehouseMapper {
    int deleteByPrimaryKey(String code);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    Warehouse selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
}