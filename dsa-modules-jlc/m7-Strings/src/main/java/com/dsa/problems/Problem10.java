package com.dsa.problems;
//P10 -- Reverse the Vowels of String
public class Problem10 {
    static boolean isVowel(char ch){
        boolean b = ch == 'a' || ch=='e' || ch=='i' || ch=='o'||ch=='u';
        return b;
    }
    static String reverseVowel(String str){
        int n = str.length();
        char chArry[] = str.toCharArray();
        int start = 0;
        int end = n - 1;

        while (start < end ){
            while ( !isVowel(chArry[start])){
                start++;
            }
            while (!isVowel(chArry[end])){
                end --;
            }
            if (start <end){
                char temp = chArry[start];
                chArry[start] = chArry[end];
                chArry[end] = temp;
            }
            start++;
            end--;
        }
        String resStr = new String(chArry);
        return resStr;
    }
    public static void main(String[] args) {
        String str = "hello";
        String result = reverseVowel(str);
        System.out.println(result);
    }
}
