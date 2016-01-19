package com.therealdanvega.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.therealdanvega.json.JsonDateSerializer;


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
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date postedOn;
	
	@ElementCollection
	private List<String> keywords;
	
	private Boolean active;

	@ManyToOne
	private Author author;
	
	@SuppressWarnings("unused")
	public Post(){}
	
	public Post(String title){
		this.setTitle(title);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@JsonSerialize(using=JsonDateSerializer.class) 
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

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Post [title=" + title + "]";
	}
	
}