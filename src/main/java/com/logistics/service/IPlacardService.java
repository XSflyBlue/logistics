package com.logistics.service;

import java.util.List;

import com.logistics.model.Placard;

public interface IPlacardService {
	public Placard selectById(Integer id);
	public List<Placard> selectAll();
}
