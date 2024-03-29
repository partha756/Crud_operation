package com.project.sub.exception;

public class ProjectNotFoundException extends RuntimeException{
	public ProjectNotFoundException(Long id) {
		super(" Not Found"+ id);
	}

}
