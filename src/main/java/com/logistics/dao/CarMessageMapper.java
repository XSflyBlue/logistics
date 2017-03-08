package com.logistics.dao;

import com.logistics.model.CarMessage;
import com.logistics.model.CarMessageExample;
import java.util.List;

public interface CarMessageMapper {
    int deleteByPrimaryKey(Integer code);

    int insert(CarMessage record);

    int insertSelective(CarMessage record);

    List<CarMessage> selectByExample(CarMessageExample example);

    CarMessage selectByPrimaryKey(Integer code);

    int updateByPrimaryKeySelective(CarMessage record);

    int updateByPrimaryKey(CarMessage record);
}