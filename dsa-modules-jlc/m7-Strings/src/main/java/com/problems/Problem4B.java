package com.problems;
//check weather the given string is pallindrome or Not
public class Problem4B {
    public static void main(String[] args) {
        String str1  = "gadag";
        boolean b1 = isPalindrome(str1);
        System.out.println(b1);
    }

    private static boolean isPalindrome(String str1) {
        int n =str1.length();
        int start = 0;
        int end = n-1;
        while (start < end){
            if (str1.charAt(start)  != str1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
//Time compl : O(n/2) => O(n)
//Aux  : O(1)
