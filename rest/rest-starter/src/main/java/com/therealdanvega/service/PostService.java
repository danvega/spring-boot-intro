package com.therealdanvega.service;

import com.therealdanvega.domain.Post;

public interface PostService {
	
	Iterable<Post> list();
	
	Post getPost(long id);
	
	Post save(Post post);

	void delete(long id);

	Post update(long id, Post post);
	
}
