package com.imp.interview;

import java.util.HashMap;
//Longest Substring Without Repeating Characters: Find the length of the longest substring without repeating characters in a given string.
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int startIndex = 0; // Start index of the current substring
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            char currentChar = s.charAt(endIndex);

            if (charIndexMap.containsKey(currentChar)) {
                // If the current character is seen before, update the start index
                startIndex = Math.max(startIndex, charIndexMap.get(currentChar) + 1);
            }

            charIndexMap.put(currentChar, endIndex); // Update the index of the current character

            // Calculate the length of the current substring
            int currentLength = (endIndex - startIndex) + 1;

            // Update maxLength if the current substring is longer
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String input = "abcabcd";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
