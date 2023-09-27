package com.leetcode;

import java.util.HashMap;

//3. Longest Substring Without Repeating Characters
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Problem3 {
    public static void main(String[] args) {
       // String str = "abcabcbb";
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                // If the current character is already in the substring, update the start pointer
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Update the character's index in the map
            charIndexMap.put(currentChar, end);

            // Calculate the current substring length
            int currentLength = end - start + 1;

            // Update the maximum length if needed
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}
