package com.logistics.dao;

import com.logistics.model.Logistics;

public interface LogisticsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    Logistics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKey(Logistics record);
}