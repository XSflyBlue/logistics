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
import com.logistics.model.Placard;
import com.logistics.service.IPlacardService;
import com.logistics.util.CountTime;

@Controller
public class PlacardController {
	@Resource
	private IPlacardService placardService;
	private Placard placard;

	@RequestMapping("/placardShow")
	public String placardShow(HttpServletRequest request) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			List<Placard> placardList = this.placardService.selectAll();
			if (placardList != null) {
				request.getSession().setAttribute("placardList", placardList);
			}
		}
		return "manager/placard/placard_show";
	}

	@RequestMapping("/placardDetail")
	public String placardDetail(HttpServletRequest request) {
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			return "placard/placard_detail";
		}
		placard = this.placardService.selectById(id);
		if (placard == null) {
			return "placard/placard_detail";
		}
		request.getSession().setAttribute("palcard", placard);
		return "manager/placard/placard_detail";
	}

	@RequestMapping("/placardAdd")
	public String placardAdd(HttpServletRequest request) {
		return "manager/placard/placard_add";
	}

	@RequestMapping("/placardAddConfig")
	public String placardAddConfig(HttpServletRequest request, Model model) {
		// 验证
		String title = request.getParameter("title");
		String content = request.getParameter("content");

		placard = new Placard();
		placard.setTitle(title);;
		placard.setContent(content);
		
		// 时间/用户名
		placard.setIssuedate(new Date());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			placard.setAuthor(customer.getName());
			int flag = placardService.insertSelective(placard);
			if (flag == 0) {
				model.addAttribute("info", "公告信息发布失败！！！");
				return "manager/placard/placard_addFailInfo";
			}
			model.addAttribute("info", "公告信息已经成功完成！！！");
			return "manager/placard/placard_changeInfo";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}
	@RequestMapping("/placardChange")
	public String memberChange(HttpServletRequest request) {
		//潜在问题
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			return "manager/placard/placard_show";
		}
		Placard placard = this.placardService.selectById(id);
		if (placard == null) {
			return "manager/placard/placard_show";
		}
		request.getSession().setAttribute("placard", placard);
		return "manager/placard/placard_change";
	}
	
	@RequestMapping("/placardChangeConfig")
	public String placardChangeConfig(HttpServletRequest request,Model model) {
		int id ;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			model.addAttribute("info","公告信息修改失败");
			return "manager/placard/placard_addFailInfo";
		}
		String content = request.getParameter("content");
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		
		Placard placard = new Placard();
		placard.setId(id);
		placard.setAuthor(author);
		placard.setContent(content);
		CountTime countTime = new CountTime();
		placard.setIssuedate(countTime.currentlyTime());
		placard.setTitle(title);

		Customer customer = (Customer) request.getSession().getAttribute("customer");	
		String login = (String) request.getSession().getAttribute("login");

		if (customer != null && login != null) {
			int flag = placardService.updateById(placard);
			if(flag == 0){
				model.addAttribute("info","公告信息更新失败");
				return "manager/placard/placard_updateFailInfo";
			}
			model.addAttribute("info","公告信息更新成功");
			return "manager/placard/placard_changeInfo";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}
	
	@RequestMapping("/placardDelete")
	public String placardDelete(HttpServletRequest request,Model model) {
		int id ;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			model.addAttribute("info","公告信息修改失败");
			return "manager/placard/placard_changeInfo";
		}
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			int flag = placardService.deleteById(id);
			if(flag == 0){
				model.addAttribute("info","公告信息删除失败");
				return "manager/placard/placard_changeInfo";
			}
			model.addAttribute("info","公告信息删除成功");
			return "manager/placard/placard_changeInfo";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}
}
