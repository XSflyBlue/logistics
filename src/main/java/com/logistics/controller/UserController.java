package com.logistics.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Customer;
import com.logistics.model.GoodsMsg;
import com.logistics.service.ICustomerService;
import com.logistics.util.SendEmail;

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
		return "register";
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
		return "found";
	}
	@RequestMapping("/userFoundConfig")
	public String userFound(HttpServletRequest request,Model model) {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String result=request.getParameter("result");
		String question=request.getParameter("question");
		//验证
		customer = this.customerService.getCustomerByName(name);
		if(customer == null){
			model.addAttribute("info","此用户不存在");
			return "foundInfo";
		}

		if(customer.getEmail().equals(email)
				&& customer.getResult().equals(result)
				&& customer.getQuestion().equals(question)){
            SendEmail send = new SendEmail(customer);
            //启动线程，线程启动之后就会执行run方法来发送邮件
            send.start();
			model.addAttribute("info","密码找回成功，我们已经发了一封密码的电子邮件，请查收，如果没有收到，可能是网络原因，过一会儿就收到了！！");
			return "info";
		}
		model.addAttribute("info","用户信息有误");
		return "foundInfo";
	}

	@RequestMapping("/userLogout")
	public String userLogout(HttpServletRequest request, Model model) {
		customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			request.getSession().removeAttribute("customer");
			request.getSession().removeAttribute("login");
			model.addAttribute("info", customer.getName() + "退出成功");
			return "info";
		}
		if (login != null) {
			request.getSession().removeAttribute("login");
			return "index";
		}
		return "index";
	}
	@RequestMapping("/userManager")
	public String userManager(HttpServletRequest request, Model model) {
		//bug，浏览器不关，登录信息依然存在
		customer = (Customer) request.getSession().getAttribute("customer");
		if(customer == null){
			model.addAttribute("info", "用户未登录");
			return "info";
		}
		if (customer.getPow().equals("2")) {
			return "manager/index";
		}else{
			model.addAttribute("info", "用户权限不足");
			return "info";
		}
	}
	
	@RequestMapping("/memberShow")
	public String menberShow(HttpServletRequest request,Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			List<Customer> customerListAll = this.customerService.selectAll();
			if (customerListAll != null) {
				request.getSession().setAttribute("customerListAll", customerListAll);
			}
			return "manager/member/member_show";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}
	
	@RequestMapping("/memberDelete")
	public String memberDelete(HttpServletRequest request,Model model) {
		customer = (Customer) request.getSession().getAttribute("customer");	
		String login = (String) request.getSession().getAttribute("login");
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			model.addAttribute("info","用户信息删除失败");
			return "manager/member/member_changeInfo";
		}
		if (customer != null && login != null) {
			if(id == customer.getId()){
				model.addAttribute("info","无法删除自身账号");
				return "manager/member/member_changeInfo";
			}
			int flag = customerService.deleteById(id);
			if(flag == 0){
				model.addAttribute("info","用户信息删除失败");
				return "manager/member/member_changeInfo";
			}
			model.addAttribute("info","用户信息删除成功");
			return "manager/member/member_changeInfo";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}
	
	@RequestMapping("/memberChange")
	public String memberChange(HttpServletRequest request) {
		//潜在问题
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			return "manager/member/memberShow";
		}
		Customer customerE = this.customerService.selectById(id);
		if (customer == null) {
			return "manager/member/memberShow";
		}
		request.getSession().setAttribute("customerE", customerE);
		return "manager/member/member_change";
	}
	
	
	@RequestMapping("/memberChangeConfig")
	public String memberChangeConfig(HttpServletRequest request,Model model) {
		int id ;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			model.addAttribute("info","用户信息修改失败");
			return "manager/member/member_changeFailInfo";
		}
		String result = request.getParameter("result");
		String question = request.getParameter("question");
		String phone = request.getParameter("phone");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String pow = request.getParameter("pow");
		String issuedate = request.getParameter("issuedate");
		
		
		Customer customerE = new Customer();
		customerE.setId(id);
		customerE.setName(name);
		customerE.setEmail(email);
		customerE.setSex(sex);
		customerE.setPassword(password);
		customerE.setPhone(phone);
		customerE.setQuestion(question);
		customerE.setResult(result);
		customerE.setPow(pow);
		customerE.setIssuedate(issuedate);

		customer = (Customer) request.getSession().getAttribute("customer");	
		String login = (String) request.getSession().getAttribute("login");

		if (customer != null && login != null) {
			int flag = customerService.updateById(customerE);
			if(flag == 0){
				model.addAttribute("info","用户信息更新失败");
				return "manager/member/member_updateFailInfo";
			}
//			if(customerE.getId().equals(customer.getId())){
//				model.addAttribute("info","用户信息更新成功,重新登陆");
//				return "";
//			}
			model.addAttribute("info","用户信息更新成功");
			return "manager/member/member_changeInfo";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}
}
