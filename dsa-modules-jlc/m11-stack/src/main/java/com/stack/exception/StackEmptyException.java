package com.stack.exception;

public class StackEmptyException extends RuntimeException{
    public StackEmptyException(String msg){
       super(msg);
    }
}
