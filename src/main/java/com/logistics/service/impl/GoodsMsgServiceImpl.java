package com.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.logistics.dao.GoodsMsgMapper;
import com.logistics.model.GoodsMsg;
import com.logistics.model.GoodsMsgExample;
import com.logistics.model.GoodsMsgExample.Criteria;
import com.logistics.service.IGoodsMsgService;

@Service("goodsMsgServiceService")  
public class GoodsMsgServiceImpl implements IGoodsMsgService {
	@Resource
	private GoodsMsgMapper goodsMsgDao;

	public List<GoodsMsg> getGoodsMsgTop8() {
		// TODO Auto-generated method stub
		GoodsMsgExample example = new GoodsMsgExample();
		Criteria criteria = example.createCriteria();
		//排序分页未做
//		example.setOrderByClause("IssueDate desc");
		// id序列小于等于8
		criteria.andIdLessThanOrEqualTo(8);
		List<GoodsMsg> goodsMsgList = goodsMsgDao.selectByExample(example);
		if (goodsMsgList.size() == 0) {
			return null;
		}
		return goodsMsgList;
	}

	public int insertSelective(GoodsMsg record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
