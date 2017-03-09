package com.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.logistics.dao.PlacardMapper;
import com.logistics.model.Placard;
import com.logistics.model.PlacardExample;
import com.logistics.model.PlacardExample.Criteria;
import com.logistics.service.IPlacardService;
@Service("placardService")
public class PlacardServiceImpl implements IPlacardService{
	@Resource
	private PlacardMapper placardDao;
	public Placard selectById(Integer id) {
		return this.placardDao.selectByPrimaryKey(id);
	}

	public List<Placard> selectAll() {
		PlacardExample example = new PlacardExample();
		Criteria criteria = example.createCriteria();
		criteria.andAuthorIsNotNull().andContentIsNotNull();
		List<Placard> placardList = placardDao.selectByExample(example);
		if(placardList.size()!=0){
			return placardList;
		}
		return null;
	}

}
