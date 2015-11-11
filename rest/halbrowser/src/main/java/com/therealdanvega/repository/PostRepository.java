package com.therealdanvega.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.therealdanvega.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

	List<Post> findByAuthorFirstName(@Param("firstName") String firstName);

}
