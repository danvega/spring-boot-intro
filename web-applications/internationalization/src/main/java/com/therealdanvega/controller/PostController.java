package com.therealdanvega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/posts")
public class PostController {

	@RequestMapping("/")
	public String list(){
		return "views/list";
	}

}
