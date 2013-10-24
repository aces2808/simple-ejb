package com.sample.ejb.exception;

public class EjbGenericException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EjbGenericException() {
		super();
	}

	public EjbGenericException(String message, Throwable cause) {
		super(message, cause);
	}

	public EjbGenericException(String message) {
		super(message);
	}

	public EjbGenericException(Throwable cause) {
		super(cause);
	}

}
