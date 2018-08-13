package com.marriage.rest.exception;

import java.io.Serializable;

public class ErrorResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 669568210800280732L;
	private String statusCode;
	private String error;
	private String errorMessage;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
