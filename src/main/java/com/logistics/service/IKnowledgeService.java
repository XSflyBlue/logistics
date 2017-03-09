package com.logistics.service;

import java.util.List;

import com.logistics.model.Knowledge;

public interface IKnowledgeService {
	public Knowledge selectById(Integer id);
	public List<Knowledge> selectAll();
}
