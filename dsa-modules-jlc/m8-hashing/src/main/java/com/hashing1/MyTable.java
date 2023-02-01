package com.hashing1;
//Hashing provides O(1) average time complexity for 3 Important Operations - Search , Insert , Delete
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
    public void delete(int key) {
        mytable[key]--;
    }
    public int search(int key) {
        return mytable[key];
    }
    public void show(){
        for(int i=0;i< capacity;i++){
            if(mytable[i] !=0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
