package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Rate;
import com.chinajey.admin.dao.entity.RateKey;

public interface RateMapper {
    int deleteByPrimaryKey(RateKey key);

    int insert(Rate record);

    int insertSelective(Rate record);

    Rate selectByPrimaryKey(RateKey key);

    int updateByPrimaryKeySelective(Rate record);

    int updateByPrimaryKey(Rate record);
}