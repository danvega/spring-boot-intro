package com.therealdanvega.controller.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.therealdanvega.service.PostService;

@Controller
@RequestMapping("/admin/posts")
//@Secured( {"ROLE_ADMIN"} )
public class AdminPostController {
	
	private PostService postService;
	
	@Autowired
	public AdminPostController(PostService postService) {
		this.postService = postService;
	}
	
	@RequestMapping("/")
	public String list(Model model, HttpServletRequest request) {
		model.addAttribute("posts", postService.list());
		return "admin/post/list";		
	}
	
}
