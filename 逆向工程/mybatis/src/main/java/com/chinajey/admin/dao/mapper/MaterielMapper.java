package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.Materiel;

public interface MaterielMapper {
    int deleteByPrimaryKey(String itemcode);

    int insert(Materiel record);

    int insertSelective(Materiel record);

    Materiel selectByPrimaryKey(String itemcode);

    int updateByPrimaryKeySelective(Materiel record);

    int updateByPrimaryKey(Materiel record);
}