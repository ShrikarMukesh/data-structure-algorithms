package com.dsa.oops;

class Parent1{
    int anInt = 10;
    public Parent1(String str){
        System.out.println(str);
    }
}
class Child1 extends Parent1{
    int anInt = 100;
    public Child1(String str){
        super(str);
        System.out.println(str);
    }
}
public class Overiding {
    public static void main(String[] args) {
        Parent1 parent1 = new Parent1("Parent call");
        System.out.println(parent1.anInt);

        Child1 child1 = new Child1("Child call");
        System.out.println(child1.anInt);
    }
}
