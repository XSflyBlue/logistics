package com.logistics.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;

public class EnterpriseController {
	
	//未使用
	@RequestMapping("/enterpriseMsgShowTop8")
	public String userRegister() {
		return "enterprise/indexShow";
	}
}
