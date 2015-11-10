package com.therealdanvega.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.therealdanvega.domain.Author;

public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
