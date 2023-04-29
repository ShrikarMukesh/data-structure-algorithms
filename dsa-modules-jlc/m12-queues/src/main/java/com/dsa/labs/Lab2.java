package com.dsa.labs;

import java.util.ArrayDeque;
import java.util.Queue;

public class Lab2 {
    public static void main(String[] args) {
        //Queue<Integer> myQueue = new LinkedList<>();
        Queue<Integer> myQueue = new ArrayDeque<>();
        System.out.println(myQueue);
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);
        System.out.println("---------------------------");
        System.out.println(myQueue);
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());
        System.out.println("---------------------------");
        System.out.println(myQueue.element());
        myQueue.remove();
        myQueue.remove();
        System.out.println("---------------------------");
        System.out.println(myQueue.element());
    }
}
