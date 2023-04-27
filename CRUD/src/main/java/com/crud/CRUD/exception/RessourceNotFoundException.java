package com.crud.CRUD.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


public class RessourceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	public RessourceNotFoundException(String message) {
		super(message);
		}
		
}


