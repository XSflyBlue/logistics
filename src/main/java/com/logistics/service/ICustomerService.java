package com.logistics.service;

import com.logistics.model.Customer;

public interface ICustomerService {
	public Customer getCustomerByName(String customerName);
	public int insertSelective(Customer record);
}
