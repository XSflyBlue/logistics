package com.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.logistics.dao.EnterpriseMapper;
import com.logistics.model.Enterprise;
import com.logistics.model.EnterpriseExample;
import com.logistics.model.EnterpriseExample.Criteria;
import com.logistics.service.IEnterpriseService;

@Service("enterpriseService")
public class EnterpriseServiceImpl implements IEnterpriseService{
	@Resource
	private EnterpriseMapper enterpriseDao;

	public List<Enterprise> getEnterpriseMsgTop8() {
	EnterpriseExample example = new EnterpriseExample();
		Criteria criteria = example.createCriteria();
		//排序分页未做
//		example.setOrderByClause("IssueDate desc");
		// id序列小于等于8
		criteria.andIdLessThanOrEqualTo(8);
		List<Enterprise> enterpriseList = enterpriseDao.selectByExample(example);
		if (enterpriseList.size() == 0) {
			return null;
		}
		return enterpriseList;
	}

	public int insertSelective(Enterprise record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
