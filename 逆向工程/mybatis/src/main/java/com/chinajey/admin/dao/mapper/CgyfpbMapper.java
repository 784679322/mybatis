package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Cgyfpb;

public interface CgyfpbMapper {
    int deleteByPrimaryKey(String code);

    int insert(Cgyfpb record);

    int insertSelective(Cgyfpb record);

    Cgyfpb selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(Cgyfpb record);

    int updateByPrimaryKey(Cgyfpb record);
}