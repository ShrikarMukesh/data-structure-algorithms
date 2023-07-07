package com.labs;

import java.util.ArrayList;
import java.util.List;

public class Lab3 {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(10);
        mylist.add(20);
        mylist.add(30);
        mylist.add(40);
        System.out.println(mylist);
        mylist.add(50);
        System.out.println(mylist);
        mylist.remove(Integer.valueOf(40));
        System.out.println(mylist);
       //ArrayList has many Built-In methods to Use
    }
}
