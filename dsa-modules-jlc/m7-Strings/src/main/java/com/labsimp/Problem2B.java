package com.labsimp;

public class Problem2B {
    static void reverse(char chArr[], int start, int end) {
        while (start < end) {
            char temp = chArr[start];
            chArr[start] = chArr[end];
            chArr[end] = temp;
            start++;
            end--;
        }
    }
    static void reverseWords(char chArr[]) {
        int n = chArr.length;
        int start = 0;
        int end = 0;
        while (end < n) {
            if (chArr[end] == ' ') {
                reverse(chArr, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverse(chArr, start, end-1); // Reverse Last Word
        reverse(chArr, 0, n-1); //Reverse the Entire String
    }
    public static void main(String[] args) {
        String str = "SD OK";
        System.out.println(str);
        char chArr[] = str.toCharArray();
        reverseWords(chArr);
        String revStr= new String(chArr);
        System.out.println(revStr);
    }
}
//Time Complexity - O(3n) /O(n)
//Aux Space --- O(n)