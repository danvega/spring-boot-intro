package com.therealdanvega.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.therealdanvega.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	/*
	 * I will return the last post that was created.
	 */
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);

}
