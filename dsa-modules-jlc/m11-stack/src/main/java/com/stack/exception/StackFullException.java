package com.stack.exception;

public class StackFullException extends RuntimeException{
    public StackFullException(String msg){
        super(msg);
    }
}
