package com.trees.exception;

public class StackFullException extends RuntimeException{
    public StackFullException(String msg){
        super(msg);
    }
}
