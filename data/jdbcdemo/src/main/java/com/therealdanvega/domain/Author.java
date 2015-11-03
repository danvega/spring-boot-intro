package com.therealdanvega.domain;

import java.util.List;

public class Author {
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private List<Post> posts;

	public Author(String first, String last){
		this.setFirstName(first);
		this.setLastName(last);
	}
	
	public Author(String first, String last, String email){
		this.setFirstName(first);
		this.setLastName(last);
		this.setEmail(email);
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
