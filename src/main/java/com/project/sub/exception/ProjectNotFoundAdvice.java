package com.project.sub.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;



@ControllerAdvice
public class ProjectNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(ProjectNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String,String> exceptiondata(ProjectNotFoundException pexception){
		Map<String,String> error=new HashMap<>();
		error.put("errormessage",pexception.getMessage());
		return error;
	}
	

}