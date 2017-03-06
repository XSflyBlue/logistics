package com.logistics.dao;

import com.logistics.model.GoodsMsg;

public interface GoodsMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsMsg record);

    int insertSelective(GoodsMsg record);

    GoodsMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsMsg record);

    int updateByPrimaryKey(GoodsMsg record);
}