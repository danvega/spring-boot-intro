package com.therealdanvega.exception;

public class PostNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1226439803994500725L;

	public PostNotFoundException(String msg){
		super(msg);
	}
	
}
