package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(String userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}