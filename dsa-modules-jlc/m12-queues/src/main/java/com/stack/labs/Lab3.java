package com.stack.labs;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Lab3 {
    public static void main(String[] args) {
        //Queue<Integer> myQueue = new LinkedList<>();
        Queue<Integer> myQueue = new ArrayDeque<>();

        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(50);
        System.out.println(myQueue);

        Iterator<Integer> iterator = myQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() +"\t");
        }

        for (Integer integer : myQueue){
            System.out.print(integer+ "\t");
        }
    }
}
