package com.therealdanvega.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.therealdanvega.domain.Post;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

		List<Post> findByTitleContaining(@Param("title") String title);
	
}
