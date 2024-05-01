package ru.danila.exceptions;

public class CastToDoubleException extends RuntimeException{
    public CastToDoubleException(String message) {
        super(message);
    }

    public CastToDoubleException() {
        this("Unable to convert this expression to double value");
    }
}
