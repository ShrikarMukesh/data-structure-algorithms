package com.dsa.exception;

public class StackEmptyException extends RuntimeException{
    public StackEmptyException(String msg){
       super(msg);
    }
}
