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
		String name;
		name = request.getParameter("name");
		customer = this.customerService.getCustomerByName(name);
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
	@RequestMapping("/userRegistConfig")
	public String userRegistConfig(HttpServletRequest request,Model model){		
		//验证
		String name=request.getParameter("name");
		customer = this.customerService.getCustomerByName(name);
		if(customer != null){
			model.addAttribute("info","此用户已经被占用请重新注册");
			return "registInfo";
		}
		
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String sex=request.getParameter("sex");
		String phone=request.getParameter("phone");
		String result=request.getParameter("result");
		String question=request.getParameter("question");
		//待完成
		if(name == null || "".equals(name) ){
			
		}
		customer = new Customer();
		customer.setName(name);
		customer.setPassword(password);
		customer.setEmail(email);
		customer.setSex(sex);
		customer.setPhone(phone);
		customer.setResult(result);
		customer.setQuestion(question);
		customer.setPow("1");
		//时间待完成
		customer.setIssuedate("233");
		int flag = customerService.insertSelective(customer);
		if(flag == 0){
			model.addAttribute("info","注册失败");
			return "registInfo";
		}
		model.addAttribute("info","注册成功");
		return "info";
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
