package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Vat;

public interface VatMapper {
    int deleteByPrimaryKey(String code);

    int insert(Vat record);

    int insertSelective(Vat record);

    Vat selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Vat record);

    int updateByPrimaryKey(Vat record);
}