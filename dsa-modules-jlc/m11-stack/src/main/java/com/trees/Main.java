package com.trees;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(7383);
        integers.add(22);
        System.out.println(integers.pop());
    }
}