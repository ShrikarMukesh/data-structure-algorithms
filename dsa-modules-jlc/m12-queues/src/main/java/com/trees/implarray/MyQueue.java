package com.trees.implarray;

public class MyQueue {

    int size; // size of array
    int capacity;
    Integer myArray[];

    public MyQueue(int capacity){
        this.capacity = capacity;
        this.size=0;
        this.myArray = new Integer[capacity];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public boolean isFull(){
        return (size == capacity);
    }

    public boolean offer(int element){

        if (isFull()){
            return false;
        }
        myArray[size]  = element;
        size++;
        return true;
    }

    public Integer poll(){
        if(isEmpty()){
            return null;
        }
        int element = myArray[0];
        for(int i=0; i < size -1; i++){
            myArray[i] = myArray[i+1];
        }
        size--;
        myArray[size] = null;
        return element;
    }

    public Integer peek(){
        if(isEmpty()){
            return null;
        }
        return myArray[0];
    }

    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        return 0;
    }

    public int getRear(){
        if(isEmpty()){
            return -1;
        }
        return  size -1;
    }

    public String toString() {

        String str = "[";
        if (size != -1) {
            for (Integer x : myArray) {
                if (x != null)
                    str = str + x + ",";
            }
        }
        str = str + "]";
        return str;
    }

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue(5);
        System.out.println(myQueue.toString());
        System.out.println(myQueue.size());
        System.out.println(myQueue.isEmpty());

        myQueue.offer(10);
        myQueue.offer(20);
        myQueue.offer(30);
        myQueue.offer(40);
        myQueue.offer(50);

        System.out.println(myQueue);
    }
}
