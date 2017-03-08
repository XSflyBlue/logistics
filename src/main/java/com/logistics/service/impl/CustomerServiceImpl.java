package com.logistics.service.impl;

import javax.annotation.Resource;  

import org.springframework.stereotype.Service;  
  
import com.logistics.model.Customer;
import com.logistics.model.CustomerExample;
import com.logistics.model.CustomerExample.Criteria;
import com.logistics.dao.CustomerMapper; 
import com.logistics.service.ICustomerService;
  
@Service("customerService")  
public class CustomerServiceImpl implements ICustomerService {  
    @Resource  
    private CustomerMapper customerDao;  

	public Customer getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		CustomerExample example = new CustomerExample();    
		Criteria criteria = example.createCriteria();    
		criteria.andNameEqualTo(customerName);
		if(customerDao.selectByExample(example)!=null && customerDao.selectByExample(example).size()!=0){
			return customerDao.selectByExample(example).get(0);
		}
		return null;
	}
	
	public int insertSelective(Customer record) {
		// TODO Auto-generated method stub
		return customerDao.insertSelective(record);
	}
}  