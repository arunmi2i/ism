package com.ideas2it.ism.exception;

public class IsmException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

    public IsmException(String message) {
        this.message = message;
    }

    public String toString() {
        return(message);
    }
}