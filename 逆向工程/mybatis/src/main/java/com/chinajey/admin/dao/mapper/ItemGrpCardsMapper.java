package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.ItemGrpCards;

public interface ItemGrpCardsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemGrpCards record);

    int insertSelective(ItemGrpCards record);

    ItemGrpCards selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemGrpCards record);

    int updateByPrimaryKey(ItemGrpCards record);
}