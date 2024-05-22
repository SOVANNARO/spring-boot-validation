package org.tutorials.springBootValidation.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    private String message;

    public EmailAlreadyExistsException(String message) {
        super(message);
    }
}
