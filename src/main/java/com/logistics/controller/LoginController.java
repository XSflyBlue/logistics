package com.logistics.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Customer;
import com.logistics.service.ICustomerService;

@Controller
public class LoginController {
	@Resource
	private ICustomerService customerService;

	@RequestMapping("/login")
	public String toIndex(HttpServletRequest request, Model model) {
		int customerId = Integer.parseInt(request.getParameter("id"));
		Customer customer = this.customerService.getCustomerById(customerId);
		if (customer != null) {
			// model.addAttribute("customer", customer);
			request.getSession().setAttribute("customer", customer);
			request.getSession().setAttribute("login", "success");
		}
		System.out.println(99999);
		return "aaa";
	}
	@RequestMapping("test")
	public String toIndex2() {
		System.out.println(99999);
		return "aaa";
	}
	
}
