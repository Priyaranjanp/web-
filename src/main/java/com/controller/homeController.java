package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	@RequestMapping("/gum")
	public String demo(){
		return "gr";
	}
	@RequestMapping("/gum1")
	public String demo1() {
		return "gr1";
	}
}
