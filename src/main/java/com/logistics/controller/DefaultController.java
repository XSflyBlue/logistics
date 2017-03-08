package com.logistics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DefaultController {
	@RequestMapping("/index")
	public String index () {
		return "index"; 		
	}
	@RequestMapping("/register")
	public String register() {
		return "register"; 		
	}
}
