package com.example.myorder.exceptions;

public class AlreadyExistsRuntimeException extends RuntimeException{
    public AlreadyExistsRuntimeException(String message){
        super(message);
    }
}
