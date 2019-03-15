package com.javalesson.exeptions;

public class InvalidInputParamException extends RuntimeException{

    public InvalidInputParamException() {
    }

    public InvalidInputParamException(String message) {
        super(message);
    }

    public InvalidInputParamException(String message, Throwable cause) {
        super(message, cause);
    }

    private InvalidInputParamException(Throwable cause) {
        super(cause);
    }
}
