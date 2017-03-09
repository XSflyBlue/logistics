package com.logistics.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.logistics.dao.PlacardMapper;
import com.logistics.model.Placard;
import com.logistics.service.IPlacardService;

@Controller
public class PlacardController {
	@Resource
	private IPlacardService placardService;
	private Placard placard;

	@RequestMapping("/placardShow")
	public String placardShow(HttpServletRequest request){
		String login = (String)request.getSession().getAttribute("login");
		if(login!=null && login.equals("success")){
			List<Placard> placardList = this.placardService.selectAll();
			if(placardList!= null){
				request.getSession().setAttribute("placard", placardList);
			}
		}
		return "placard/placard_show";
	}

	@RequestMapping("/placardDetail")
	public String placardDetail(HttpServletRequest request){
		int id;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		} catch (Exception e) {
			return "placard/placard_detail";
		}
		placard = this.placardService.selectById(id);
		if(placard == null){
			return "placard/placard_detail";
		}
		request.getSession().setAttribute("palcard", placard);
		return "placard/placard_detail";
	}
}
