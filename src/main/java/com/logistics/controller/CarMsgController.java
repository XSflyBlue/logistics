package com.logistics.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CarMsgController {
	
	@RequestMapping("/carMsgShowTop8")
	public String userRegister() {
		return "car/indexShow";
	}
}
