package com.logistics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Customer;
import com.logistics.model.Knowledge;
import com.logistics.model.Logistics;
import com.logistics.model.Placard;
import com.logistics.service.ILogisticsService;
import com.logistics.util.CountTime;

@Controller
public class LogisticsController {
	@Resource
	private ILogisticsService logisticsService;
	private Logistics logistics;

	@RequestMapping("/activeShow")
	public String activeSelect(HttpServletRequest request,Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			List<Logistics> logisticsList = this.logisticsService.selectAll();
			if (logisticsList != null) {
				request.getSession().setAttribute("logisticsList", logisticsList);
			}
			return "logistics/active_show";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}

	@RequestMapping("/activeDetail")
	public String activeDetail(HttpServletRequest request) {
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			return "logistics/active_detail";
		}
		logistics = this.logisticsService.selectById(id);
		if (logistics == null) {
			return "logistics/active_detail";
		}
		request.getSession().setAttribute("logistics", logistics);
		return "logistics/active_detail";
	}
	
	@RequestMapping("/activeDelete")
	public String logisticsDelete(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			int flag = logisticsService.deleteById(id);
			if (flag == 0) {
				model.addAttribute("info", "物流动态删除失败");

				return "logistics/active_info1";
			}
			request.getSession().removeAttribute("logisticsList");
			model.addAttribute("info", "物流动态删除成功");
			return "logistics/active_changeInfo";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}
	
	@RequestMapping("/activeChange")
	public String activeChange(HttpServletRequest request) {
		//潜在问题
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			return "logistics/active_show";
		}
		Logistics logistics = this.logisticsService.selectById(id);
		if (logistics == null) {
			return "logistics/active_show";
		}
		request.getSession().setAttribute("logistics", logistics);
		
		return "logistics/active_change";
	}

	@RequestMapping("/activeChangeConfig")
	public String activeChangeConfig(HttpServletRequest request, Model model) {
		int id ;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			model.addAttribute("info","公告信息修改失败");
			return "logistics/active_updateFailInfo";
		}
		String content = request.getParameter("content");
		String author = request.getParameter("author");
		String title = request.getParameter("title");

		Logistics logistics = new Logistics();
		logistics.setId(id);
		logistics.setAuthor(author);
		logistics.setContent(content);
		CountTime countTime = new CountTime();
		logistics.setIssuedate(countTime.currentlyTime());
		logistics.setTitle(title);

		Customer customer = (Customer) request.getSession().getAttribute("customer");	
		String login = (String) request.getSession().getAttribute("login");

		if (customer != null && login != null) {
			int flag = logisticsService.updateById(logistics);
			if(flag == 0){
				model.addAttribute("info","物流动态更新失败");
				return "logistics/active_updateFailInfo";
			}
			model.addAttribute("info","物流动态更新成功");
			return "logistics/active_changeInfo";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";}
}
