package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.SupplierGroup;

public interface SupplierGroupMapper {
    int deleteByPrimaryKey(String code);

    int insert(SupplierGroup record);

    int insertSelective(SupplierGroup record);

    SupplierGroup selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(SupplierGroup record);

    int updateByPrimaryKey(SupplierGroup record);
}