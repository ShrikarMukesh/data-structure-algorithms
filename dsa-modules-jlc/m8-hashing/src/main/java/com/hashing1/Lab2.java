package com.hashing1;

public class Lab2 {
    public static void main(String[] args) {
        MyHashSet myset = new MyHashSet(7);
        myset.insert(50);
        myset.insert(21);
        myset.insert(58);
        myset.insert(17);
        myset.insert(15);
        myset.insert(49);
        myset.insert(56);
        myset.insert(22);
        myset.insert(23);
        myset.insert(25);
        myset.insert(23);
        myset.insert(25);
        System.out.println(myset);
        myset.delete(23);
        myset.delete(25);
        myset.delete(50);
        System.out.println(myset);
        System.out.println(myset.search(50));
        System.out.println(myset.search(49));
    }
}
