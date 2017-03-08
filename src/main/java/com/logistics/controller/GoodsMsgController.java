package com.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsMsgController {
	
	//未使用
	@RequestMapping("/goodsMsgShowTop8")
	public String goodsMsgShowTop8() {
		return "goods/indexShow";
	}
}
