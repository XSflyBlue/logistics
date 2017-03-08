package com.logistics.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;

public class EnterpriseController {
	
	
	@RequestMapping("/enterpriseMsgShowTop8")
	public String userRegister() {
		return "enterprise/indexShow";
	}
}
