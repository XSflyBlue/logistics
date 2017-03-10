package com.logistics.service;

import java.util.List;

import com.logistics.model.Enterprise;
import com.logistics.model.GoodsMsg;

public interface IEnterpriseService {
	public List< Enterprise > getEnterpriseMsgTop8();
	public int insertSelective(Enterprise record);
	public List<Enterprise> selectAll();
	public Enterprise selectById(int id);
	public int updateById(Enterprise record);
	public int deleteById(Integer id);
}
