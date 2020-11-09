package com.cg.go.greatoutdoor.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CentralizedExceptionHandler {

	@ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
	public String handlerUserNotFound(UserNotFoundException e)
	{
        return e.getMessage();
    }
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	    @ExceptionHandler(Exception.class)
	    public String handleAll(Exception e){
	        return e.getMessage();
	    }
}
