package com.logistics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Logistics;
import com.logistics.service.ILogisticsService;

@Controller
public class LogisticsController {
	@Resource
	private ILogisticsService logisticsService;
	private Logistics logistics;

	@RequestMapping("/activeShow")
	public String activeSelect(HttpServletRequest request) {
		String login = (String) request.getSession().getAttribute("login");
		if(login!=null&&login.equals("success")){
			List<Logistics> logisticsList = this.logisticsService.selectAll();
			if (logisticsList != null) {
				request.getSession().setAttribute("logisticsList", logisticsList);
			}
		}
		return "logistics/active_show";
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
}
