package com.therealdanvega.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.springframework.data.annotation.CreatedDate;


@Entity
public class Post {

	@Id @GeneratedValue
	private Long id;
	private String title;
	
	@Column(columnDefinition = "TEXT")
	private String body;
	
	@Column(columnDefinition = "TEXT")
	private String teaser;
	
	private String slug;
	
	@CreatedDate 
	@Temporal(TemporalType.TIMESTAMP)
	private Date postedOn;

	@ManyToOne
	//@JsonManagedReference
	private Author author;
	
	@SuppressWarnings("unused")
	private Post(){
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Post(String title){
		this.setTitle(title);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getPostedOn() {
		return postedOn;
	}

	public void setPostedOn(Date postedOn) {
		this.postedOn = postedOn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public String getTeaser() {
		return teaser;
	}

	public void setTeaser(String teaser) {
		this.teaser = teaser;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + "]";
	}
	
}
