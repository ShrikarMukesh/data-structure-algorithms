package com.dsa.labs;
class MyTable{
    int capacity;
    int[] mytable;
    public MyTable(int capacity){
        this.capacity=capacity;
        this.mytable = new int[capacity];
    }
    public void insert(int key){
        mytable[key]++;
    }
    public void show(){
        for(int i=0;i< mytable.length;i++){
            System.out.print(mytable[i] + " ");
        }
    }

}
public class Lab1 {
    public static void main(String[] args) {
        MyTable myTable = new MyTable(25);
        myTable.insert(5);
        myTable.insert(6);
        myTable.show();
    }
}
