package com.logistics.dao;

import com.logistics.model.Placard;
import com.logistics.model.PlacardExample;
import java.util.List;

public interface PlacardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Placard record);

    int insertSelective(Placard record);

    List<Placard> selectByExample(PlacardExample example);

    Placard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Placard record);

    int updateByPrimaryKey(Placard record);
}