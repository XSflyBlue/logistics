package com.logistics.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Customer;
import com.logistics.service.ICustomerService;

@Controller
public class UserController {
	@Resource
	private ICustomerService customerService;
	private Customer customer;

	@RequestMapping("/userLoginCheck")
	public String loginCheck(HttpServletRequest request, Model model) {
		int customerId;
		try {
			customerId = Integer.parseInt(request.getParameter("userid"));
			customer = this.customerService.getCustomerById(customerId);
		} catch (Exception e) {
			model.addAttribute("info", "登录失败");
			return "info";
		}
		if (customer != null && customer.getPassword().equals(request.getParameter("password"))) {
			request.getSession().setAttribute("customer", customer);
			request.getSession().setAttribute("login", "success");
			model.addAttribute("info", customer.getName() + "登录成功");
			if (null != null) {
				// 权限验证
			}
			return "info";
		}
		model.addAttribute("info", "密码或账号错误，登录失败");
		return "info";
	}

	@RequestMapping("/userRegister")
	public String userRegister() {
		return "register";// 测试页面
	}

	@RequestMapping("/userFound")
	public String userFound() {
		return "aaa";
	}

	@RequestMapping("/userLogout")
	public String userExit(HttpServletRequest request, Model model) {
		customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			request.getSession().removeAttribute("customer");
			request.getSession().removeAttribute("login");
			model.addAttribute("info", customer.getName() + "退出成功");
			return "info";
		}
		return "index";
	}
}
