package com.therealdanvega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authors")
public class AuthorController {

	@RequestMapping("/list")
	public String list(){
		return "author/list";
	}
	
}
