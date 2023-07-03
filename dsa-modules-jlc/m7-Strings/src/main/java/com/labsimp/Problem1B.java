package com.labsimp;

public class Problem1B {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        String revStr = reverseString(str);
        System.out.println(revStr);
    }

    private static String reverseString(String str) {
        String result = new String();
        char[] arr = str.toCharArray();
        for (int i=arr.length-1;i>=0;i--){
            result = result+ arr[i];
        }
        return result;
    }
}
