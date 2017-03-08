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
	@RequestMapping("/found")
	public String found() {
		return "found"; 		
	}
	@RequestMapping("/logistics")
	public String logistics(){
		return "aaa"; //测试页面
	}
	@RequestMapping("/knowledge")
	public String knowledge(){
		return "aaa"; //测试页面
	}
	@RequestMapping("/goodsMsg")
	public String goodsMsg(){
		return "aaa"; //测试页面
	}
	@RequestMapping("/carMsg")
	public String carMsg(){
		return "aaa"; //测试页面
	}
	@RequestMapping("/enterprise")
	public String enterprise(){
		return "aaa"; //测试页面
	}
}
