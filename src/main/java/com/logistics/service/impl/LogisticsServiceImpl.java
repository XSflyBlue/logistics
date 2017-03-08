package com.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.logistics.dao.LogisticsMapper;
import com.logistics.model.Logistics;
import com.logistics.model.LogisticsExample;
import com.logistics.model.LogisticsExample.Criteria;
import com.logistics.service.ILogisticsService;

@Service("logisticsService") 
public class LogisticsServiceImpl implements ILogisticsService {
	@Resource
	private LogisticsMapper logisticsDao;

	public Logistics selectById(Integer id) {
		return this.logisticsDao.selectByPrimaryKey(id);
	}

	public List<Logistics> selectAll() {
		LogisticsExample example = new LogisticsExample();    
		Criteria criteria = example.createCriteria();
		criteria.andAuthorIsNotNull().andContentIsNotNull().andContentIsNotNull();
		List<Logistics> logisticsList = logisticsDao.selectByExample(example);
		if(logisticsList.size()!=0){
			return logisticsList;
		}
		return null;
	}
}
