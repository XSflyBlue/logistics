package com.logistics.service.impl;

import java.util.List;

import javax.annotation.Resource;  

import org.springframework.stereotype.Service;  
  
import com.logistics.model.Customer;
import com.logistics.model.CustomerExample;
import com.logistics.model.GoodsMsg;
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
		List<Customer> customerList = customerDao.selectByExample(example);
		if(customerList.size()!=0){
			return customerList.get(0);
		}
		return null;
	}
	
	public int insertSelective(Customer record) {
		return customerDao.insertSelective(record);
	}
	
	public List<Customer> selectAll() {
		CustomerExample example = new CustomerExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIsNotNull();
		List<Customer> customerListAll = customerDao.selectByExample(example);
		if(customerListAll.size()!=0){
			return customerListAll;
		}
		return null;
	}

	public int deleteById(int id) {
		return this.customerDao.deleteByPrimaryKey(id);
	}

	public Customer selectById(int id) {
		Customer customer = customerDao.selectByPrimaryKey(id);
		if(customer!=null){
			return customer;
		}
		return null;
	}
	public int updateById(Customer record) {
		// TODO Auto-generated method stub
		return this.customerDao.updateByPrimaryKey(record);
	}
}  