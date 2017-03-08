package com.logistics.dao;

import com.logistics.model.Logistics;
import com.logistics.model.LogisticsExample;
import java.util.List;

public interface LogisticsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Logistics record);

    int insertSelective(Logistics record);

    List<Logistics> selectByExample(LogisticsExample example);

    Logistics selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Logistics record);

    int updateByPrimaryKey(Logistics record);
}