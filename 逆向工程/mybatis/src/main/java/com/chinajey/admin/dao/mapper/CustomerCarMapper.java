package com.chinajey.admin.dao.mapper;

import com.chinajey.admin.dao.entity.CustomerCar;

public interface CustomerCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerCar record);

    int insertSelective(CustomerCar record);

    CustomerCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CustomerCar record);

    int updateByPrimaryKey(CustomerCar record);
}