package com.logistics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Knowledge;
import com.logistics.service.IKnowledgeService;

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
}
