package com.logistics.service;

import java.util.List;
import com.logistics.model.CarMessage;

public interface ICarMsgService {
	public List< CarMessage > getCarMsgTop8();
	public int insertSelective(CarMessage record);
	public List<CarMessage> selectAll();
	public CarMessage selectById(int id);
	public int updateById(CarMessage record);
	public int deleteById(Integer id);
}
