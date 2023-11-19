package com.graphs.labs;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Stack;
//Stack multithreaded
public class Lab1 {
    public static void main(String[] args) {
        //Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new ArrayDeque<>();

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        System.out.println("Peek = " + stack.peek()); //50
        System.out.println(stack);

        stack.pop();
        stack.pop();

        System.out.println("After pop = "+ stack);
        System.out.println("Peek = " + stack.peek()); //50
    }
}
