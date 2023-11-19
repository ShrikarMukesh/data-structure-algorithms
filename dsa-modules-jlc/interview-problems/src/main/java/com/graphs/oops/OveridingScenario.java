package com.graphs.oops;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@Slf4j
class Parent{
    private static Logger logger =  LoggerFactory.getLogger(Parent.class);

    int x = 56;
    public String gmMessage(){
        return "Hello Shrikar from parent";
    }

    public Integer randomValue(){
        Random random = new Random(2);
        int a = random.ints(556).sum();
        System.out.println("Random Generated Value : "+ a);
        return a;
    }
    //Exception Scenario

}
class Child extends Parent{
    int x = 90;
    public String gmMessage(){
        System.out.println("Child X value:" + x);
        return "Hello Shrikar : from Child";
    }
}
public class OveridingScenario {
    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println(parent.gmMessage());
        System.out.println(parent.x);

        Parent parent1 = new Child();
        System.out.println(parent1.gmMessage());
        System.out.println(parent1.x);

        Child child = new Child();
        child.randomValue();
    }
}
