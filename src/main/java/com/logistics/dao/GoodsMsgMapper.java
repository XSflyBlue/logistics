package com.logistics.dao;

import com.logistics.model.GoodsMsg;
import com.logistics.model.GoodsMsgExample;
import java.util.List;

public interface GoodsMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsMsg record);

    int insertSelective(GoodsMsg record);

    List<GoodsMsg> selectByExample(GoodsMsgExample example);

    GoodsMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsMsg record);

    int updateByPrimaryKey(GoodsMsg record);
}