package com.logistics.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.model.CarMessage;
import com.logistics.model.Customer;
import com.logistics.service.ICarMsgService;

@Controller
public class CarMsgController {
	@Resource
	private ICarMsgService carMsgService;
	private CarMessage carMessage;

	// 未使用
	@RequestMapping("/carMsgShowTop8")
	public String userRegister() {
		return "car/indexShow";
	}

	@RequestMapping("/carShow")
	public String activeSelect(HttpServletRequest request, Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			List<CarMessage> carMsgListAll = this.carMsgService.selectAll();
			if (carMsgListAll != null) {
				request.getSession().setAttribute("carMsgListAll", carMsgListAll);
			}
			return "car/car_show";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}

	@RequestMapping("/carDetail")
	public String carDetail(HttpServletRequest request, Model model) {
		String login = (String) request.getSession().getAttribute("login");
		if (login != null && login.equals("success")) {
			int id;
			try {
				id = Integer.parseInt(request.getParameter("id"));
			} catch (Exception e) {
				// 潜在问题
				return "car/car_detail";
			}
			carMessage = this.carMsgService.selectById(id);
			if (carMessage == null) {
				return "car/car_detail";
			}
			request.getSession().setAttribute("carMessage", carMessage);
			return "car/car_detail";
		}
		model.addAttribute("info", "请完成登陆");
		return "info";
	}

	@RequestMapping("/carAdd")
	public String carAdd() {
		return "car/car_add";
	}

	@RequestMapping("/carChange")
	public String carChange(HttpServletRequest request) {
		return "car/car_change";
	}

	@RequestMapping("/carConfig")
	public String carConfig(HttpServletRequest request, Model model) {
		// 验证
		String cLicenseNumber = request.getParameter("cLicenseNumber");
		String cStyle = request.getParameter("cStyle");
		String cBrand = request.getParameter("cBrand");
		String cCarLoad = request.getParameter("cCarLoad");
		String cUsedTime = request.getParameter("cUsedTime");
		String cTransportStyle = request.getParameter("cTransportStyle");
		String cDriverName = request.getParameter("cDriverName");
		String cLicenseNum = request.getParameter("cLicenseNum");
		String cDriverTime = request.getParameter("cDriverTime");
		String cLicenseStyle = request.getParameter("cLicenseStyle");
		String cLinkMan = request.getParameter("cLinkMan");
		String cLinkPhone = request.getParameter("cLinkPhone");
		String cRemark = request.getParameter("cRemark");

		carMessage = new CarMessage();
		carMessage.setLicencenumber(cLicenseNumber);
		carMessage.setStyle(cStyle);
		carMessage.setBrand(cBrand);
		carMessage.setCarload(cCarLoad);
		carMessage.setUsedtime(cUsedTime);
		carMessage.setTransportstyle(cTransportStyle);
		carMessage.setDrivername(cDriverName);
		carMessage.setDrivertime(cDriverTime);
		carMessage.setLicencestyle(cLicenseStyle);
		carMessage.setLinkman(cLinkMan);
		carMessage.setLinkphone(cLinkPhone);
		carMessage.setRemark(cRemark);

		// 时间/用户名
		carMessage.setIssuedate(new Date());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			// carMessage.setUsername(customer.getName());
			int flag = carMsgService.insertSelective(carMessage);
			if (flag == 0) {
				model.addAttribute("info", "您输入的车辆信息发布失败！！！");
				return "car/car_info2";
			}
			request.getSession().removeAttribute("carMsgList");
			model.addAttribute("info", "您输入的车辆信息已经成功完成！！！");
			return "car/car_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}

	@RequestMapping("/carChangeConfig")
	public String carChangeConfig(HttpServletRequest request, Model model) {
		int id;
		try {
			id = Integer.parseInt(request.getParameter("code"));
		} catch (Exception e) {
			// 潜在问题
			return "car/car_detail";
		}

		String cLicenseNumber = request.getParameter("cLicenseNumber");
		String cStyle = request.getParameter("cStyle");
		String cBrand = request.getParameter("cBrand");
		String cCarLoad = request.getParameter("cCarLoad");
		String cUsedTime = request.getParameter("cUsedTime");
		String cTransportStyle = request.getParameter("cTransportStyle");
		String cDriverName = request.getParameter("cDriverName");
		String cLicenseNum = request.getParameter("cLicenseNum");
		String cDriverTime = request.getParameter("cDriverTime");
		String cLicenseStyle = request.getParameter("cLicenseStyle");
		String cLinkMan = request.getParameter("cLinkMan");
		String cLinkPhone = request.getParameter("cLinkPhone");
		String cRemark = request.getParameter("cRemark");

		carMessage.setTrademark(cLicenseNum);
		carMessage = new CarMessage();
		carMessage.setCode(id);
		carMessage.setLicencenumber(cLicenseNumber);
		carMessage.setStyle(cStyle);
		carMessage.setBrand(cBrand);
		carMessage.setCarload(cCarLoad);
		carMessage.setUsedtime(cUsedTime);
		carMessage.setTransportstyle(cTransportStyle);
		carMessage.setDrivername(cDriverName);
		carMessage.setDrivertime(cDriverTime);
		carMessage.setLicencestyle(cLicenseStyle);
		carMessage.setLinkman(cLinkMan);
		carMessage.setLinkphone(cLinkPhone);
		carMessage.setRemark(cRemark);
		// 时间/用户名
		carMessage.setIssuedate(new Date());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			// carMessage.setUsername(customer.getName());
			int flag = carMsgService.updateById(carMessage);
			if (flag == 0) {
				model.addAttribute("info", "车辆信息修改失败");
				request.setAttribute("id", carMessage.getCode());
				return "car/car_info3";
			}
			model.addAttribute("info", "车辆信息修改成功");
			return "car/car_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}

	@RequestMapping("/carDelete")
	public String carsDelete(HttpServletRequest request, Model model) {
		carMessage = (CarMessage) request.getSession().getAttribute("carMessage");
		request.setAttribute("code", carMessage.getCode());
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		String login = (String) request.getSession().getAttribute("login");
		if (customer != null && login != null) {
			int flag = carMsgService.deleteById(carMessage.getCode());
			if (flag == 0) {
				model.addAttribute("info", "车辆信息删除失败");

				return "car/car_info3";
			}
			request.getSession().removeAttribute("carMsgList");
			model.addAttribute("info", "车辆信息删除成功");
			return "car/car_info1";
		}
		model.addAttribute("info", "用户未登录");
		return "info";
	}

}
