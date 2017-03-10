package com.logistics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.Customer;
import com.logistics.model.Enterprise;
import com.logistics.service.IEnterpriseService;
import com.logistics.util.CountTime;

@Controller
public class EnterpriseController {
	@Resource
	private IEnterpriseService enterpriseService;
	private Enterprise enterprise;
	private CountTime currentTime;

	@RequestMapping("/enterpriseShow")
	public String enterpriseSelect(HttpServletRequest request, Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			List<Enterprise> enterpriseListAll = this.enterpriseService.selectAll();
			if (enterpriseListAll != null) {
				request.getSession().setAttribute("enterpriseListAll", enterpriseListAll);
			}
			return "enterprise/enterprise_show";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}

	@RequestMapping("/enterpriseDetail")
	public String enterpriseDetail(HttpServletRequest request, Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			int id;
			try {
				id = Integer.parseInt(request.getParameter("id"));
			} catch (Exception e) {
				// 潜在问题
				return "enterprise/enterprise_detail";
			}
			enterprise = this.enterpriseService.selectById(id);
			if (enterprise == null) {
				return "enterprise/enterprise_detail";
			}
			request.getSession().setAttribute("enterprise", enterprise);
			return "enterprise/enterprise_detail";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}

	@RequestMapping("/enterpriseAdd")
	public String enterpriseAdd() {
		return "enterprise/enterprise_add";
	}

	@RequestMapping("/enterpriseChange")
	public String enterpriseChange(HttpServletRequest request) {
		return "enterprise/enterprise_change";
	}

	@RequestMapping("/enterpriseConfig")
	public String enterpriseConfig(HttpServletRequest request, Model model) {
		// 验证
		String eSort = request.getParameter("eSort");
		String eName = request.getParameter("eName");
		String eOperation = request.getParameter("eOperation");
		String eWrokArea = request.getParameter("eWrokArea");
		String eAddress = request.getParameter("eAddress");
		String ePhone = request.getParameter("ePhone");
		String eLinkMan = request.getParameter("eLinkMan");
		String eHandset = request.getParameter("eHandset");
		String eFax = request.getParameter("eFax");
		String eEmail = request.getParameter("eEmail");
		String eHttp = request.getParameter("eHttp");
		String eIntro = request.getParameter("eIntro");

		enterprise = new Enterprise();
		enterprise.setEnterprisesort(eSort);
		enterprise.setEnterprisename(eName);
		enterprise.setOperation(eOperation);
		enterprise.setWorkarea(eWrokArea);
		enterprise.setAddress(eAddress);
		enterprise.setPhone(ePhone);
		enterprise.setLinkman(eLinkMan);
		enterprise.setHandset(eHandset);
		enterprise.setFax(eFax);
		enterprise.setEmail(eEmail);
		enterprise.setHttp(eHttp);
		enterprise.setIntro(eIntro);
		currentTime = new CountTime();
		// 时间/用户名
		enterprise.setIssuedate(currentTime.currentlyTimeString());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			// carMessage.setUsername(customer.getName());
			int flag = enterpriseService.insertSelective(enterprise);
			if (flag == 0) {
				model.addAttribute("info", "您输入的企业信息发布失败！！！");
				return "enterprise/enterprise_info2";
			}
			request.getSession().removeAttribute("enterpriseList");
			model.addAttribute("info", "您输入的企业信息已经成功完成！！！");
			return "enterprise/enterprise_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}

	@RequestMapping("/enterpriseChangeConfig")
	public String enterpriseChangeConfig(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		String eSort = request.getParameter("eSort");
		String eName = request.getParameter("eName");
		String eOperation = request.getParameter("eOperation");
		String eWrokArea = request.getParameter("eWrokArea");
		String eAddress = request.getParameter("eAddress");
		String ePhone = request.getParameter("ePhone");
		String eLinkMan = request.getParameter("eLinkMan");
		String eHandset = request.getParameter("eHandset");
		String eFax = request.getParameter("eFax");
		String eEmail = request.getParameter("eEmail");
		String eHttp = request.getParameter("eHttp");
		String eIntro = request.getParameter("eIntro");

		enterprise = new Enterprise();
		enterprise.setId(id);
		enterprise.setEnterprisesort(eSort);
		enterprise.setEnterprisename(eName);
		enterprise.setOperation(eOperation);
		enterprise.setWorkarea(eWrokArea);
		enterprise.setAddress(eAddress);
		enterprise.setPhone(ePhone);
		enterprise.setLinkman(eLinkMan);
		enterprise.setHandset(eHandset);
		enterprise.setFax(eFax);
		enterprise.setEmail(eEmail);
		enterprise.setHttp(eHttp);
		enterprise.setIntro(eIntro);
		// 时间/用户名
		currentTime = new CountTime();
		enterprise.setIssuedate(currentTime.currentlyTimeString());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			// carMessage.setUsername(customer.getName());
			int flag = enterpriseService.updateById(enterprise);
			if (flag == 0) {
				model.addAttribute("info", "企业信息修改失败");
				request.setAttribute("id", enterprise.getId());
				return "enterprise/enterprise_info3";
			}
			model.addAttribute("info", "企业信息修改成功");
			return "enterprise/enterprise_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}

	@RequestMapping("/enterpriseDelete")
	public String enterpriseDelete(HttpServletRequest request, Model model) {
		enterprise = (Enterprise) request.getSession().getAttribute("enterprise");
		request.setAttribute("id", enterprise.getId());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			int flag = enterpriseService.deleteById(enterprise.getId());
			if (flag == 0) {
				model.addAttribute("info", "企业信息删除失败");

				return "enterprise/enterprise_info3";
			}
			request.getSession().removeAttribute("enterpriseList");
			model.addAttribute("info", "企业信息删除成功");
			return "enterprise/enterprise_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}
}
