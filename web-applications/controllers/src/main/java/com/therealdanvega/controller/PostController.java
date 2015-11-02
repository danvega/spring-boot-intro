package com.therealdanvega.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.therealdanvega.domain.Post;

@Controller
@RequestMapping("/posts")
public class PostController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostController.class);
	
	@RequestMapping("/get/{slug}")
	public String getPost(@PathVariable(value="slug") String slug) throws Exception{
		Post post = null;
		if( post == null ) throw new Exception("We couldn't find the post with slug: " + slug);
		return "post";
	}
	
	/*
	@ExceptionHandler(Exception.class)
	public String handleException(HttpServletRequest req, Exception exception, Model model){
		model.addAttribute("errorMessage", exception.getMessage() );
		return "postError";
	}
	*/
	
}

