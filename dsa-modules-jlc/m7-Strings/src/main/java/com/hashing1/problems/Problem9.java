package com.hashing1.problems;
// P9- Remove Duplicates
public class Problem9 {
    public static void main(String[] args) {
        String str = "aabababaakjhaca";
        String result = removeduplicates(str);
        System.out.println(result);
    }

    private static String removeduplicates(String str) {

        int n =  str.length();
        int[] count = new int[26];
        StringBuffer stringBuffer = new StringBuffer();

        for (int i=0;i<n;i++){
            count[str.charAt(i) -97]++;
        }
        for(int i=0;i<count.length;i++){
            if (count[i] != 0){
                char ch = (char)(i +97);
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }

}
