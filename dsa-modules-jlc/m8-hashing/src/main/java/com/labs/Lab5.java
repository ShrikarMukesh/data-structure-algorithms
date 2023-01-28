package com.labs;
class MyHashSet{
    private int bucketSize;
    private int currentSize;
    private Integer[] mytable;

    public MyHashSet(int bucketSize){
        this.bucketSize = bucketSize;
        this.mytable = new Integer[bucketSize];
        this.currentSize =0;
    }
    public int size(){
        return this.currentSize;
    }
    public boolean isEmpty(){
        return currentSize ==0;
    }
    public void clear(){
        this.currentSize =0;
        for (int i=0;i<bucketSize;i++){
          mytable[i] =null;
        }
    }
    public int myHash1(Integer key){
        int hash = key.hashCode() % this.bucketSize;
        return hash;
    }
    public int myHash2(Integer key){
        int hash1 = myHash1(key);
        int hash2 = (this.bucketSize -1) - key % (this.bucketSize -1);
        int hash = key.hashCode() % this.bucketSize;
        return hash;
    }
    public void insert(int key){
        //int index=
    }
}
public class Lab5 {
}
