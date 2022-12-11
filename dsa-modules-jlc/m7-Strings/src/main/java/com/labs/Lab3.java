package com.labs;

public class Lab3 {
    public static void main(String[] args) {
        String str1 = "JLCD";
        String str2 = "JLCD";
        String str3 = "JLCd";
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str2));
        System.out.println(str3.equalsIgnoreCase(str2));

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));

    }
}
