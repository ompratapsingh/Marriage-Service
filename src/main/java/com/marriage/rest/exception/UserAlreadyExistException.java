package com.marriage.rest.exception;

/**
 * 
 * @author Ompratap
 *
 */
public class UserAlreadyExistException extends Exception {

	private static final long serialVersionUID = -2376730760069876832L;

	public UserAlreadyExistException(String message) {
		super(message);
	}

	public UserAlreadyExistException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
