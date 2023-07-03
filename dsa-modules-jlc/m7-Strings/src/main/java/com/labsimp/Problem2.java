package com.labsimp;

public class Problem2 {
    public static void main(String[] args) {
        String str = "shrikar mukesh";
        String[] strings = str.split(" ");
        String result = new String();
        for ( String s : strings){
           result = result.concat(reverseString(s) +" "); //reverseString(s);
        }
        System.out.println(result);
    }

    private static String reverseString(String s) {
        char[] arr = s.toCharArray();
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
