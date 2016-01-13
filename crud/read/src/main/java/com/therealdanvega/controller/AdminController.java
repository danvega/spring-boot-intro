package com.therealdanvega.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.therealdanvega.service.AuthorService;
import com.therealdanvega.service.PostService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	private PostService postService;

	private AuthorService authorService;
	
	@Autowired
	public AdminController(PostService postService, AuthorService authorService) {
		super();
		this.postService = postService;
		this.authorService = authorService;
	}

	@RequestMapping("/posts/")
	public String posts(Model model) {
		model.addAttribute("posts", postService.list());
		return "admin/post/list";
	}
	
	@RequestMapping("/authors/")
	public String authors(Model model) {
		model.addAttribute("authors", authorService.list());
		return "admin/author/list";
	}

}
