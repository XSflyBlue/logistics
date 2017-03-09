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
import com.logistics.service.IGoodsMsgService;

@Controller
public class GoodsMsgController {
	@Resource
	private IGoodsMsgService goodsMsgService;
	private GoodsMsg goodsMsg;

	@RequestMapping("/goodsShow")
	public String activeSelect(HttpServletRequest request,Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			List<GoodsMsg> goodsMsgListAll = this.goodsMsgService.selectAll();
			if (goodsMsgListAll != null) {
				request.getSession().setAttribute("goodsMsgListAll", goodsMsgListAll);
			}
			return "goods/goods_show";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}

	@RequestMapping("/goodsDetail")
	public String activeDetail(HttpServletRequest request) {
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			// 潜在问题
			return "goods/goods_detail";
		}
		goodsMsg = this.goodsMsgService.selectById(id);
		if (goodsMsg == null) {
			return "goods/goods_detail";
		}
		request.getSession().setAttribute("goodsMsg", goodsMsg);
		return "goods/goods_detail";
	}

	@RequestMapping("/goodsAdd")
	public String goodsAdd() {
		return "goods/goods_add";
	}
	
	@RequestMapping("/goodsChange")
	public String goodsChange(HttpServletRequest request) {
		return "goods/goods_change";
	}

	@RequestMapping("/goodConfig")
	public String goodConfig(HttpServletRequest request,Model model) {
		// 验证
		String gclass = request.getParameter("gclass");
		String gname = request.getParameter("gname");
		String gcount = request.getParameter("gcount");
		String gunit = request.getParameter("gunit");
		String startProvince = request.getParameter("gstartProvince");
		String gstartcity = request.getParameter("gstartcity");
		String gendProvince = request.getParameter("gendProvince");
		String gendcity = request.getParameter("gendcity");
		String gtransstyle = request.getParameter("gtransstyle");
		String gtime = request.getParameter("gtime");
		String gphone = request.getParameter("gphone");
		String glink = request.getParameter("glink");
		String gremark = request.getParameter("gremark");
		String grequest = request.getParameter("grequest");
		
		goodsMsg = new GoodsMsg();
		goodsMsg.setGoodsstyle(gclass);
		goodsMsg.setGoodsname(gname);
		goodsMsg.setGoodsnumber(gcount);
		goodsMsg.setGoodsunit(gunit);
		goodsMsg.setStartprovince(startProvince);
		goodsMsg.setStartcity(gstartcity);
		goodsMsg.setEndprovince(gendProvince);
		goodsMsg.setEndcity(gendcity);
		goodsMsg.setStyle(gtransstyle);	
		goodsMsg.setTransporttime(gtime);
		goodsMsg.setPhone(gphone);
		goodsMsg.setLink(glink);
		goodsMsg.setRemark(gremark);
		goodsMsg.setRequest(grequest);
		//时间/用户名
		goodsMsg.setIssuedate(new Date());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			goodsMsg.setUsername(customer.getName());
			int flag = goodsMsgService.insertSelective(goodsMsg);
			if(flag == 0){
				model.addAttribute("info","您输入的货物信息发布失败！！！");
				return "goods/goods_info2";
			}
			model.addAttribute("info","您输入的货物信息已经成功完成！！！");
			return "goods/goods_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}
	
	@RequestMapping("/goodsChangeConfig")
	public String goodsChangeConfig(HttpServletRequest request,Model model) {
		int code = Integer.parseInt(request.getParameter("code"));
		String gclass = request.getParameter("gclass");
		String gname = request.getParameter("gname");
		String gcount = request.getParameter("gcount");
		String gunit = request.getParameter("gunit");
		String startProvince = request.getParameter("gstartProvince");
		String gstartcity = request.getParameter("gstartcity");
		String gendProvince = request.getParameter("gendProvince");
		String gendcity = request.getParameter("gendcity");
		String gtransstyle = request.getParameter("gtransstyle");
		String gtime = request.getParameter("gtime");
		String gphone = request.getParameter("gphone");
		String glink = request.getParameter("glink");
		String gremark = request.getParameter("gremark");
		String grequest = request.getParameter("grequest");
		
		goodsMsg = new GoodsMsg();
		goodsMsg.setId(code);
		goodsMsg.setGoodsstyle(gclass);
		goodsMsg.setGoodsname(gname);
		goodsMsg.setGoodsnumber(gcount);
		goodsMsg.setGoodsunit(gunit);
		goodsMsg.setStartprovince(startProvince);
		goodsMsg.setStartcity(gstartcity);
		goodsMsg.setEndprovince(gendProvince);
		goodsMsg.setEndcity(gendcity);
		goodsMsg.setStyle(gtransstyle);	
		goodsMsg.setTransporttime(gtime);
		goodsMsg.setPhone(gphone);
		goodsMsg.setLink(glink);
		goodsMsg.setRemark(gremark);
		goodsMsg.setRequest(grequest);
		//时间/用户名
		goodsMsg.setIssuedate(new Date());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			goodsMsg.setUsername(customer.getName());
			int flag = goodsMsgService.updateById(goodsMsg);
			if(flag == 0){
				model.addAttribute("info","货物信息修改失败");
				request.setAttribute("id", goodsMsg.getId());
				return "goods/goods_info3";
			}
			model.addAttribute("info","货物信息修改成功");
			return "goods/goods_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}
	
	@RequestMapping("/goodsDelete")
	public String goodsDelete(HttpServletRequest request,Model model) {
		goodsMsg = (GoodsMsg) request.getSession().getAttribute("goodsMsg");
		request.setAttribute("id", goodsMsg.getId());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			int flag = goodsMsgService.deleteById(goodsMsg.getId());
			if(flag == 0){
				model.addAttribute("info","货物信息删除失败");

				return "goods/goods_info3";
			}
			model.addAttribute("info","货物信息删除成功");
			return "goods/goods_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}
	
}
