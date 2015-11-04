package com.therealdanvega.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.therealdanvega.domain.Post;

public interface PostRepository extends CrudRepository<Post, BigInteger> {

	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);

}
