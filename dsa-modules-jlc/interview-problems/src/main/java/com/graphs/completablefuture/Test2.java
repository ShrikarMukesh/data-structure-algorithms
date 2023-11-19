package com.graphs.completablefuture;

public class Test2 {
    public static void main(String[] args) {
        String str = "shrikar";
        String res = reverseString(str);
    }

    private static String reverseString(String str) {
         String res = rev(str, str.length()-1);
         return res;
    }
    private static String rev(String str, int counter) {

        if(counter <= 0){
            return str;
        }
        str = String.valueOf(str.charAt(counter));
        rev(str, counter--);

        return str;
    }

}
