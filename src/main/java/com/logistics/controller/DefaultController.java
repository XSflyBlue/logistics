package com.logistics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.CarMessage;
import com.logistics.model.Enterprise;
import com.logistics.model.GoodsMsg;
import com.logistics.service.IGoodsMsgService;
@Controller
public class DefaultController {
	@Resource
	private IGoodsMsgService goodsMsgService;
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<GoodsMsg> goodsMsgList = (List<GoodsMsg>) request.getSession().getAttribute("goodsMsg");
		CarMessage carMessage = (CarMessage) request.getSession().getAttribute("carMessage");
		Enterprise enterprise = (Enterprise) request.getSession().getAttribute("enterprise");
		// if(goodsMsg == null || carMessage==null || enterprise ==null){
		if (goodsMsgList == null) {
			goodsMsgList = this.goodsMsgService.getGoodsMsgTop8();
			if (goodsMsgList.size() != 0) {
				request.getSession().setAttribute("goodsMsgList", goodsMsgList);
			}
			return "index";
		}
		return "index";
	}
	@RequestMapping("/register")
	public String register() {
		return "register"; 		
	}
	@RequestMapping("/found")
	public String found() {
		return "found"; 		
	}
}