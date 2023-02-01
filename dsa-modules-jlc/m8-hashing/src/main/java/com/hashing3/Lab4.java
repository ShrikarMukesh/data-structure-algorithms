package com.hashing3;

public class Lab4 {
    public static void main(String[] args) {
        MyHashSet myset = new MyHashSet(7);
        System.out.println("------1-------");
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
        myset.insert("aa");
        myset.insert("bb");
        myset.insert("cc");
        myset.insert("dd");
        myset.insert("ee");
        myset.insert("ab");
        myset.insert("bc");
        myset.insert("cd");
        myset.insert("de");
        myset.insert("ef");
        System.out.println("------2-------");
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
        myset.delete("ab");
        myset.delete("de");
        myset.delete("dd");
        System.out.println("------3-------");
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
        System.out.println("------4-------");
        System.out.println(myset.search("aa"));
        System.out.println(myset.search("dd"));
        System.out.println("------5-------");
        myset.clear();
        System.out.println(myset.size());
        System.out.println(myset.isEmpty());
        System.out.println(myset);
    }
}
