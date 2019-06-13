package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Contact;

public interface ContactMapper {
    int deleteByPrimaryKey(Integer cntctcode);

    int insert(Contact record);

    int insertSelective(Contact record);

    Contact selectByPrimaryKey(Integer cntctcode);

    int updateByPrimaryKeySelective(Contact record);

    int updateByPrimaryKey(Contact record);
}