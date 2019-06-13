package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.SysOorg;

public interface SysOorgMapper {
    int deleteByPrimaryKey(String orgid);

    int insert(SysOorg record);

    int insertSelective(SysOorg record);

    SysOorg selectByPrimaryKey(String orgid);

    int updateByPrimaryKeySelective(SysOorg record);

    int updateByPrimaryKey(SysOorg record);
}