package com.logistics.service;

import java.util.List;
import com.logistics.model.GoodsMsg;

public interface IGoodsMsgService {
	public List< GoodsMsg > getGoodsMsgTop8();
	public int insertSelective(GoodsMsg record);
	public List<GoodsMsg> selectAll();
	public GoodsMsg selectById(int id);
	public int updateById(GoodsMsg record);
	public int deleteById(Integer id);
}
