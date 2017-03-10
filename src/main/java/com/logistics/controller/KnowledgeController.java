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
import com.logistics.model.Knowledge;
import com.logistics.model.Logistics;
import com.logistics.model.Placard;
import com.logistics.service.IKnowledgeService;
import com.logistics.util.CountTime;

@Controller
public class KnowledgeController {
	@Resource
	private IKnowledgeService knowledgeService;
	private Knowledge knowledge;

	@RequestMapping("/knowledgeShow")
	public String activeSelect(HttpServletRequest request,Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if(login!=null&&login.equals("success")){
			List<Knowledge> knowledgeList = this.knowledgeService.selectAll();
			if (knowledgeList != null) {
				request.getSession().setAttribute("knowledgeList", knowledgeList);
			}
			return "knowledge/knowledge_show";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}

	@RequestMapping("/knowledgeDetail")
	public String activeDetail(HttpServletRequest request) {
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			return "knowledge/knowledge_detail";
		}
		knowledge = this.knowledgeService.selectById(id);
		if (knowledge == null) {
			return "knowledge/knowledge_detail";
		}
		request.getSession().setAttribute("knowledge", knowledge);
		return "knowledge/knowledge_detail";
	}
	//	@RequestMapping("/knowledgeChange")
	//	public String activeChange(){
	//		
	//	}

	@RequestMapping("/knowledgeDelete")
	public String goodsDelete(HttpServletRequest request, Model model) {
		//		knowledge = (Knowledge) request.getSession().getAttribute("knowledge");
		//		request.setAttribute("id", request.getSession().getAttribute("id"));
		int id = Integer.parseInt(request.getParameter("id"));
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			int flag = knowledgeService.deleteById(id);
			if (flag == 0) {
				model.addAttribute("info", "物流知识删除失败");

				return "knowledge/knowledge_info1";
			}
			request.getSession().removeAttribute("knowledgeList");
			model.addAttribute("info", "货物信息删除成功");
			return "knowledge/knowledge_changeInfo";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}

	@RequestMapping("/knowledgeChange")
	public String knowledgeChange(HttpServletRequest request) {
		//潜在问题
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			return "knowledge/knowledge_show";
		}
		Knowledge knowledge = this.knowledgeService.selectById(id);
		if (knowledge == null) {
			return "knowledge/knowledge_show";
		}
		request.getSession().setAttribute("knowledge", knowledge);
		
		return "knowledge/knowledge_change";
	}

	@RequestMapping("/knowledgeChangeConfig")
	public String knowledgeChangeConfig(HttpServletRequest request, Model model) {
		int id ;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			model.addAttribute("info","公告信息修改失败");
			return "knowledge/knowledge_updateFailInfo";
		}
		String content = request.getParameter("content");
		String author = request.getParameter("author");
		String title = request.getParameter("title");

		Knowledge knowledge = new Knowledge();
		knowledge.setId(id);
		knowledge.setAuthor(author);
		knowledge.setContent(content);
		CountTime countTime = new CountTime();
		knowledge.setIssuedate(countTime.currentlyTime());
		knowledge.setTitle(title);

		Customer customer = (Customer) request.getSession().getAttribute("customer");	
		String login = (String) request.getSession().getAttribute("login");

		if (customer != null && login != null) {
			int flag = knowledgeService.updateById(knowledge);
			if(flag == 0){
				model.addAttribute("info","物流信息更新失败");
				return "knowledge/knowledge_updateFailInfo";
			}
			model.addAttribute("info","物流信息更新成功");
			return "knowledge/knowledge_changeInfo";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";}
}
