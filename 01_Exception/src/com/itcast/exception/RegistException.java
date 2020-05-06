package com.itcast.exception;

public class RegistException extends RuntimeException {

    public RegistException() {
    }

    public RegistException(String message) {
        super(message);
    }
}
