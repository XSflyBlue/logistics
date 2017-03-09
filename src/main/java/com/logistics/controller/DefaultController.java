package com.logistics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.CarMessage;
import com.logistics.model.Enterprise;
import com.logistics.model.GoodsMsg;
import com.logistics.service.ICarMsgService;
import com.logistics.service.IEnterpriseService;
import com.logistics.service.IGoodsMsgService;
@Controller
public class DefaultController {
	@Resource
	private IGoodsMsgService goodsMsgService;
	@Resource
	private ICarMsgService carMsgService;
	@Resource
	private IEnterpriseService enterpriseService;

	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<GoodsMsg> goodsMsgList = (List<GoodsMsg>) request.getSession().getAttribute("goodsMsgList");
		@SuppressWarnings("unchecked")
		List<CarMessage> carMsgList = (List<CarMessage>) request.getSession().getAttribute("carMsgList");
		@SuppressWarnings("unchecked")
		List<Enterprise> enterpriseList = (List<Enterprise>) request.getSession().getAttribute("enterpriseList");
		if (goodsMsgList == null || carMsgList==null) {
			goodsMsgList = this.goodsMsgService.getGoodsMsgTop8();
			carMsgList = this.carMsgService.getCarMsgTop8();
			enterpriseList = this.enterpriseService.getEnterpriseMsgTop8();
			if (goodsMsgList!=null&&goodsMsgList.size() != 0 ) {
				request.getSession().setAttribute("goodsMsgList", goodsMsgList);
			}
			if (carMsgList!=null && carMsgList.size() != 0 ) {
				request.getSession().setAttribute("carMsgList", carMsgList);
			}
			if(enterpriseList!=null&&enterpriseList.size()!=0){
				request.getSession().setAttribute("enterpriseList", enterpriseList);
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