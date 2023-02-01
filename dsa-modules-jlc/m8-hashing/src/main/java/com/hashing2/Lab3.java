package com.hashing2;

public class Lab3 {
    public static void main(String[] args) {
        MyHashSet myset = new MyHashSet(7);
        System.out.println("------1-------");
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
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
        System.out.println("------2-------");
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
        myset.delete(23);
        myset.delete(25);
        myset.delete(50);
        System.out.println("------3 After Delete-------");
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
        System.out.println("------4-------");
        System.out.println(myset.search(50));
        System.out.println(myset.search(49));
        System.out.println("------5-------");
        myset.clear();
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
    }
}
