package com.stack.labs;

import java.util.LinkedList;
import java.util.Queue;

public class Lab3 {
    public void bfs(int sourceVertex){
        boolean visited[] = new boolean[2];
        Queue<Integer> myQueue = new LinkedList<Integer>();

        myQueue.add(sourceVertex);
        visited[sourceVertex] = true;

    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
    }
}
