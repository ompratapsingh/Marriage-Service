package com.marriage.rest.exception;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.marriage.service.rest.impl.UserRestServiceImpl;

/**
 * 
 * @author Ompratap
 *
 */
@ControllerAdvice
public class ApplicationException extends ResponseEntityExceptionHandler {

	org.slf4j.Logger LOGGER = LoggerFactory.getLogger(UserRestServiceImpl.class);

	@ResponseStatus(value = HttpStatus.CONFLICT, reason = "User already exists")
	@ExceptionHandler(UserAlreadyExistException.class)
	public void handleUserAlreadyExistsException(UserAlreadyExistException e) {
		LOGGER.error("User already exists from exception class", e);
	}

	/*@ExceptionHandler(Exception.class)
	protected ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setStatusCode(HttpStatus.INTERNAL_SERVER_ERROR.toString());
		errorResponse.setError(ex.getMessage());
		errorResponse.setErrorMessage(ex.toString());
		return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}*/
}
