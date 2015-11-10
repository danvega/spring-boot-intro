package com.therealdanvega.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.therealdanvega.domain.Post;
import com.therealdanvega.repository.AuthorRepository;
import com.therealdanvega.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	@Autowired
	public PostServiceImpl(PostRepository postRepository, AuthorRepository authorRepository){
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public Iterable<Post> list() {
		return postRepository.findAll();
	}

	@Override
	public Post read(long id) {
		return postRepository.findOne(id);
	}

	@Override
	@Transactional
	public Post create(Post post) {
		// save the new author
		authorRepository.save(post.getAuthor());
		return postRepository.save(post);
	}

	@Override
	public void delete(long id) {
		postRepository.delete(id);
	}

	@Override
	public Post update(long id,Post update) {
		Post post = postRepository.findOne(id);
		if( update.getTitle() != null ) {
			post.setTitle(update.getTitle());
		}
		return postRepository.save(post);
	}

}
