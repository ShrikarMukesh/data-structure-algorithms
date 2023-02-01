package com.hashing3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
    private int bucketSize;
    private int currentSize;
    List<LinkedList<String>> mytable;
    public MyHashSet(int bucketSize) {
        this.bucketSize = bucketSize;
        this.mytable = new ArrayList<LinkedList<String>>(bucketSize);
        for(int i=0;i<bucketSize;i++) {
            mytable.add(new LinkedList<String>());
        }
    }
    public int size() {
        return this.currentSize;
    }
    public boolean isEmpty() {
        return currentSize==0;
    }
    public void clear() {
        this.mytable.clear();
        for(int i=0;i<bucketSize;i++) {
            mytable.add(new LinkedList<String>());
        }
        this.currentSize=0;
    }
    public void insert(String key) {
        int index = myhash(key);
        if( !search(key)) {
            mytable.get(index).add(key);
            currentSize++;
        }
    }
    public void delete(String key) {
        int index = myhash(key);
        mytable.get(index).remove(key);
        currentSize--;
    }
    public boolean search(String key) {
        int index = myhash(key);
        return mytable.get(index).contains(key);
    }
    public int myhash(String key) {
        int hash = key.hashCode() % this.bucketSize;
        return hash;
    }
    public String toString() {
        return mytable.toString();
    }
}
