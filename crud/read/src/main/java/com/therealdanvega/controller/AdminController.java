package com.therealdanvega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/")
	@ResponseBody
	public String home(){
		return "Home";
	}
	
}
