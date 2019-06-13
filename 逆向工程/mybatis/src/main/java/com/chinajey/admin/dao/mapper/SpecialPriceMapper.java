package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.SpecialPrice;
import com.chinajey.admin.dao.entity.SpecialPriceKey;

public interface SpecialPriceMapper {
    int deleteByPrimaryKey(SpecialPriceKey key);

    int insert(SpecialPrice record);

    int insertSelective(SpecialPrice record);

    SpecialPrice selectByPrimaryKey(SpecialPriceKey key);

    int updateByPrimaryKeySelective(SpecialPrice record);

    int updateByPrimaryKey(SpecialPrice record);
}