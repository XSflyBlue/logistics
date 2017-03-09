package com.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.logistics.dao.CarMessageMapper;
import com.logistics.model.CarMessage;
import com.logistics.model.CarMessageExample;
import com.logistics.model.CarMessageExample.Criteria;
import com.logistics.service.ICarMsgService;

@Service("carMsgService")
public class CarServiceImpl implements ICarMsgService{
	@Resource
	private CarMessageMapper carMsgDao;

	public List<CarMessage> getCarMsgTop8() {
		CarMessageExample example = new CarMessageExample();
		Criteria criteria = example.createCriteria();
		//排序分页未做
//		example.setOrderByClause("IssueDate desc");
		// id序列小于等于8
		criteria.andCodeLessThanOrEqualTo(8);
		List<CarMessage> carMsgList = carMsgDao.selectByExample(example);
		if (carMsgList.size() == 0) {
			return null;
		}
		return carMsgList;
	}

	public int insertSelective(CarMessage record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
