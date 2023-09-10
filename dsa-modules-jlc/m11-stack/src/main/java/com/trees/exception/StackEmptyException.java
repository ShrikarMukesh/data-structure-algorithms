package com.trees.exception;

public class StackEmptyException extends RuntimeException{
    public StackEmptyException(String msg){
       super(msg);
    }
}
