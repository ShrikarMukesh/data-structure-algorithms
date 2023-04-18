package com.dsa.labs;

import java.util.Stack;
//Stack multithreaded
public class Lab1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        stack.add(10);
        stack.add(32);
        stack.add(33);
        stack.add(9);
        System.out.println("Peek" + stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println("After pop = "+ stack);
    }
}
