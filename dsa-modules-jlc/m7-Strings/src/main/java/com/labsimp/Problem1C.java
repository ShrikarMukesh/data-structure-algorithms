package com.labsimp;


public class Problem1C {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);
        String revStr = reverseString(str);
        System.out.println(revStr);
    }
    private static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int start = 0, end = arr.length -1;
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        String result  = new String(arr);
        return result;
    }
}
// Time Complexity - - O(n/2)/O(n)
// Aux Space - O(n)