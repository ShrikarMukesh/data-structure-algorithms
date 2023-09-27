package com.labs;

public class Lab1 {
    public static void main(String[] args) {
        System.out.println("main - begin");
        m1();
        System.out.println("main - end");
    }
    static void m1() {
        System.out.println("m1 - begin");
        m2();
        System.out.println("m1 - end");
    }
    static void m2() {
        System.out.println("I am m2");
    }
}
