package com.logistics.service.impl;

import javax.annotation.Resource;  

import org.springframework.stereotype.Service;  
  
import com.logistics.model.Customer;
import com.logistics.dao.CustomerMapper; 
import com.logistics.service.ICustomerService;
  
@Service("customerService")  
public class CustomerServiceImpl implements ICustomerService {  
    @Resource  
    private CustomerMapper customerDao;  

    public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return this.customerDao.selectByPrimaryKey(customerId);
	}  
  
}  