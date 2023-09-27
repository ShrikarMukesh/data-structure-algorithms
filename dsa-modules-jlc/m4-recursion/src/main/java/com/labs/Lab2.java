package com.labs;
/*
Every time the Recursive call is happened then that Method call will be pushed into
Stack.
 When the method execution is completed then that Method call will be poped from
Stack
 See the below Example on Method Calls with Recursion without Basecase.
 When Base case is not specified then StackOverflowError will be thrown at
Runtime.
 */
public class Lab2 {
    public static void main(String[] args) {
        show();
    }

    private static void show() {
        System.out.println("Show Method");
        show();
    }
}
