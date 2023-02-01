package com.hashing2;

import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@ToString
public class MyHashSet {
    private int bucketsize;
    private int currentsize;
    List<LinkedList<Integer>> mytable;

    public MyHashSet(int bucketsize){
        this.bucketsize = bucketsize;
        this.mytable = new ArrayList<LinkedList<Integer>>(bucketsize);

        for (int i=0;i<bucketsize;i++){
            mytable.add(new LinkedList<Integer>());
        }
    }

    public int size(){
        return currentsize;
    }

    public boolean isEmpty(){
        return currentsize ==0;
    }

    public void insert(int key) {
        int hash = myHash(key);
        if(!search(key)){
            mytable.get(hash).add(key);
            currentsize++;
        }
    }

    public void delete(int key) {
        int index = myHash(key);
        mytable.get(index).remove((Integer) key);
        currentsize--;
    }

    public boolean search(int key) {
        int hash = myHash(key);
        return mytable.get(hash).contains(key);
    }

    public void clear() {
        this.mytable.clear();
        for (int i=0;i<bucketsize;i++){
            mytable.add(new LinkedList<>());
        }
        this.currentsize = 0;
    }
    public int myHash(Integer key){
        int hash = key.hashCode() % this.bucketsize;
        return hash;
    }
}
