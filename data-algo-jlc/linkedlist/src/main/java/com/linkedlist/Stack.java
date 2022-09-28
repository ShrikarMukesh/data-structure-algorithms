package com.linkedlist;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

class Stack<T> implements Iterable<T> {

    private  LinkedList<T> list = new LinkedList<>();

    //No Argument constructor
    public Stack(){}

    //One Argument constructor
    public Stack(T elem){
        push(elem);
    }
    //check stack size
    public int size(){
        return list.size();
    }
    //add elements to statck
    public void push(T elem){
        list.addLast(elem);
    }
    //Check weatcher stack is empty
    public boolean isEmpty(){
        return size() == 0;
    }
    //pop
    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
