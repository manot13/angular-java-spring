package com.nathan.bookstore.exceptions;

public class ObjectNoFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ObjectNoFoundException(String message) {
        super(message);
    }

    public ObjectNoFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

