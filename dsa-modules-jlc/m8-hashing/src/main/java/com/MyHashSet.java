package com;
import lombok.ToString;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@ToString
public class MyHashSet {
    int bucket;
    List<LinkedList<Integer>> mytable;;

    public MyHashSet(int bucket){
        this.bucket = bucket;
        //Defalut Size of ArrayList is 10, but in our case we are considering bucket size from User Input
        this.mytable = new ArrayList<LinkedList<Integer>>(bucket);
        for (int i=0;i<bucket;i++){
            //Defalut Size of LinkedList is 0
            mytable.add(new LinkedList<>());
        }
    }

    public void insert(int key) {
        int index = key % bucket;
        mytable.get(index).add(key);
    }

    public void delete(int key){
        int index = key % bucket;
        mytable.get(index).remove((Integer) key);
    }

    public boolean search(int key){
        int index = key % bucket;
        return mytable.get(index).contains(key);
    }
    //Lombok toString is better than this
//    public String toString(){
//        return mytable.toString();
//    }

}
