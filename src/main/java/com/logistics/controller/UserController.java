package com.logistics.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Customer;
import com.logistics.service.ICustomerService;

@Controller
public class UserController {
	@Resource
	private ICustomerService customerService;

	@RequestMapping("/userLoginCheck")
	public String loginCheck(HttpServletRequest request) {
		int customerId ; 
		Customer customer;
		try{
			customerId = Integer.parseInt(request.getParameter("userid"));
			customer = this.customerService.getCustomerById(customerId);
		}catch(Exception e){
			return "index";
		}
		if (customer != null && customer.getPassword().equals(request.getParameter("password"))) {
			request.getSession().setAttribute("customer", customer);
			request.getSession().setAttribute("login", "success");
		}
		return "index";
	}
	@RequestMapping("/userRegister")
	public String userRegister() {
		return "WEB-INF/jsp/aaa";//测试页面
	}
	@RequestMapping("/userFound")
	public String userFound() {
		return "WEB-INF/jsp/aaa";
	}
}
