package com.labs;
class MyTable{
    int mytable[];
    int capacity;

    public MyTable(int capacity){
       this.capacity = capacity;
       mytable = new int[capacity];
    }
    public void insert(int key){
        mytable[key]++;
    }
    public void delete(int key){
        mytable[key]--;
    }
    public int search(int key){
        return mytable[key];
    }
}
public class Lab1 {
    public static void main(String[] args) {
        MyTable myTable = new MyTable(25);

    }
}
