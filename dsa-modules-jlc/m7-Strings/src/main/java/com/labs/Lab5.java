package com.labs;

public class Lab5 {
    public static void main(String[] args) {
        String str1 = "shrikarmukesh";
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(8));

        System.out.println(str1.substring(7));
        System.out.println(str1.substring(3,7));  //beginIndex

        System.out.println(str1.indexOf("muk"));
        System.out.println(str1.indexOf("r"));
        System.out.println(str1.lastIndexOf("r"));

        System.out.println(str1.contains("kar"));
        System.out.println(str1.contains("hello"));
    }
}
