package com.logistics.service;

import java.util.List;

import com.logistics.model.Customer;

public interface ICustomerService {
	public Customer getCustomerByName(String customerName);
	public int insertSelective(Customer record);
	public List<Customer> selectAll();
	public int deleteById(int id);
	public Customer selectById(int id);
	public int updateById(Customer record);
}
