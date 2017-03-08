package com.logistics.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsMsgController {
	@Resource
	
	
	@RequestMapping("/goodsMsgShowTop8")
	public String userRegister() {
		return "indexShow";
	}
}
