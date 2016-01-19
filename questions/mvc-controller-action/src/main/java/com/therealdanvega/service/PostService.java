package com.therealdanvega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.therealdanvega.domain.Post;
import com.therealdanvega.repository.PostRepository;

@Service
public class PostService {

	private PostRepository postRepository;
	
	@Autowired
	public PostService(PostRepository postRepository){
		this.postRepository = postRepository;
	}
	
	public Post getLatestPost(){
		return postRepository.findFirstByOrderByPostedOnDesc();
	}

	public List<Post> list() {
		return postRepository.findAllByOrderByPostedOnDesc();
	}

	public Post getBySlug(String slug) {
		return postRepository.findBySlug(slug);
	}

	public List<Post> listByAuthor(Long id) {
		return postRepository.findAllByAuthorIdOrderByPostedOnDesc(id);
	}

	public Post get(Long id) {
		return postRepository.findOne(id);
	}

	public Post save(Post post) {
		return postRepository.save(post);
	}
	
	public void delete(Long id) {
		postRepository.delete(id);
	}
}
