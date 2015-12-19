package com.therealdanvega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.therealdanvega.domain.Post;
import com.therealdanvega.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {
	
	private PostService postService;
	
	@Autowired
	public PostController(PostService postService){
		this.postService = postService;
	}
	
	@RequestMapping("/")
	public Post home(){
		return postService.getLatestPost();
	}

	@RequestMapping("/list")
	public List<Post> listPosts(Model model){
		return postService.list();
	}

	@RequestMapping("/view/{slug}")
	public Post view(@PathVariable(value="slug") String slug, Model model){
		return postService.getBySlug(slug);
	}
}
