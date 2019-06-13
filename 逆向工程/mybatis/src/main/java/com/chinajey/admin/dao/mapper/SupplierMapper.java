package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Supplier;

public interface SupplierMapper {
    int deleteByPrimaryKey(String cardcode);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    Supplier selectByPrimaryKey(String cardcode);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}