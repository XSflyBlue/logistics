package com.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.logistics.dao.KnowledgeMapper;
import com.logistics.model.Knowledge;
import com.logistics.model.KnowledgeExample;
import com.logistics.model.KnowledgeExample.Criteria;
import com.logistics.service.IKnowledgeService;

@Service("knowledgeService")
public class KnowledgeServiceImpl implements IKnowledgeService{
	@Resource
	private KnowledgeMapper knowledgeDao;

	public Knowledge selectById(Integer id) {
		return this.knowledgeDao.selectByPrimaryKey(id);
	}

	public List<Knowledge> selectAll() {
		KnowledgeExample example = new KnowledgeExample();
		Criteria criteria = example.createCriteria();
		criteria.andAuthorIsNotNull().andContentIsNotNull().andContentIsNotNull();
		List<Knowledge> knowledgeList = knowledgeDao.selectByExample(example);
		if(knowledgeList.size()!=0){
			return knowledgeList;
		}
		return null;
	}
}
