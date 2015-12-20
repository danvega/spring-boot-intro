package com.therealdanvega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	public Iterable<Post> list(){
		return postService.list();
	}
	
	@RequestMapping("/byAuthor/{first}")
	public List<Post> byAuthor( @PathVariable(value="first") String first ) {
		return postService.byAuthor(first);
	}
	
	@RequestMapping("/byKeyword/{keyword}")
	public List<Post> byKeyword( @PathVariable(value="keyword") String keyword ) {
		return postService.byKeyword(keyword);
	}
	
	@RequestMapping("/active")
	public List<Post> active() {
		return postService.findActive();
	}
	
	@RequestMapping("/slug/{slug}")
	public Post findPostBySlug(@PathVariable(value="slug") String slug ) {
		return postService.findBySlug(slug);
	}
}
