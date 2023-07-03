package com;

public class Lab1 {
    public static void main(String[] args) {
        MyTable mytable = new MyTable(25);
        mytable.insert(5);
        mytable.insert(2);
        mytable.insert(7);
        mytable.insert(9);
        mytable.insert(0);
        mytable.show();
        mytable.delete(0);
        mytable.delete(2);
        System.out.println("After Delete--");
        mytable.show();
        System.out.println("----------");
        System.out.println(mytable.search(5));
        System.out.println(mytable.search(2));
    }
}
