package com.hashing1.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem9B {
    public static void main(String[] args) {
        String str = "aabababaakjhaca";
        String result = removeduplicates(str);
        System.out.println(result);
    }

    private static String removeduplicates(String str) {
        Set<Character> characterSet = new HashSet<>();
        int n = str.length();
        for (int i=0;i<n;i++){
            if(characterSet.contains(str.charAt(i)))
             characterSet.add(str.charAt(i));
        }
        String res = Arrays.toString(characterSet.toArray());
        return res;
    }
}
