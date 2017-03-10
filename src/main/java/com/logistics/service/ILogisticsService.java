package com.logistics.service;

import java.util.List;
import com.logistics.model.Logistics;

public interface ILogisticsService {
	public Logistics selectById(Integer id);
	public List<Logistics> selectAll();
	public int deleteById(int id);
	public int updateById(Logistics logistics);
}
