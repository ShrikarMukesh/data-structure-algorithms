package com.stack.labs;

import com.stack.exception.StackEmptyException;
import lombok.ToString;

@ToString
public class MyStack {
    private Integer myarray[];
    private int capacity;
    private int top;

    public MyStack(int capacity){
        this.capacity = capacity;
        int top =-1;
        this.myarray = new Integer[capacity];
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return (top ==-1);
    }

    public void push(Integer element){
        if(top == capacity -1){
            //throw new StackFullException("Full exception");
            int newCapacity = this.capacity + 10;
            Integer mynewArray[] = new Integer[newCapacity];
        }
        top++;
        myarray[top] = element;
    }

    public Integer pop(){
        if (top ==-1){
            throw new StackEmptyException("Empty statck");
        }
        int element = myarray[top];
        top--;
        return element;
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(32);
        stack.push(33);
        stack.push(9);

        System.out.println(stack);
        stack.pop();
        stack.pop();
        stack.pop();stack.pop();stack.pop();stack.pop();
        System.out.println("After pop = "+ stack);

    }
}
