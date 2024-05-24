package com.stack.labs;

import java.util.ArrayDeque;
import java.util.Queue;

public class Lab1 {
    public static void main(String[] args) {
        //Queue<Integer> myQueue = new LinkedList<>();
        Queue<Integer> myQueue = new ArrayDeque<>();
        System.out.println(myQueue);
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());

        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);myQueue.offer(50);
        System.out.println("---------------------------");
        System.out.println(myQueue);
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());
        System.out.println("---------------------------");
        System.out.println(myQueue.peek());
        myQueue.poll();
        myQueue.poll();
        System.out.println("---------------------------");
        System.out.println(myQueue.peek());
    }
}
