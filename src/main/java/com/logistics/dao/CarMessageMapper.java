package com.logistics.dao;

import com.logistics.model.CarMessage;

public interface CarMessageMapper {
    int deleteByPrimaryKey(Integer code);

    int insert(CarMessage record);

    int insertSelective(CarMessage record);

    CarMessage selectByPrimaryKey(Integer code);

    int updateByPrimaryKeySelective(CarMessage record);

    int updateByPrimaryKey(CarMessage record);
}