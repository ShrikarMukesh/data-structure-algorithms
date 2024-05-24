package com.stack.labs;

import java.util.ArrayDeque;
import java.util.Deque;

//ArrayDeque - Single Threaded
public class Lab2 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
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
