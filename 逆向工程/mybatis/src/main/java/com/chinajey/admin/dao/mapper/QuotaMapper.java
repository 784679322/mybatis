package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Quota;

public interface QuotaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Quota record);

    int insertSelective(Quota record);

    Quota selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Quota record);

    int updateByPrimaryKey(Quota record);
}