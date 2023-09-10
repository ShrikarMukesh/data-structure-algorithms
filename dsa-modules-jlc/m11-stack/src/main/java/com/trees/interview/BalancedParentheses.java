package com.trees.interview;

import java.util.*;

public class BalancedParentheses {
    public static boolean isBalancedParentheses(String inputString) {
        Stack<Character> stack = new Stack<>();
        char[] openingBrackets = {'(', '[', '{'};
        char[] closingBrackets = {')', ']', '}'};

        for (char c : inputString.toCharArray()) {
            if (contains(openingBrackets, c)) {
                stack.push(c);
            }
            else if (contains(closingBrackets, c)) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.pop();
                    if (!areMatchingBrackets(top, c)) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean contains(char[] arr, char c) {
        for (char ch : arr) {
            if (ch == c) {
                return true;
            }
        }
        return false;
    }

    private static boolean areMatchingBrackets(char opening, char closing) {
        return (opening == '(' && closing == ')') || (opening == '[' && closing == ']') || (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {
        String string1 = "{[()()]}";
        String string2 = "{[(])}";
        String string3 = "{[()[]]}";

        System.out.println(isBalancedParentheses(string1));  // Output: true
        System.out.println(isBalancedParentheses(string2));  // Output: false
        System.out.println(isBalancedParentheses(string3));  // Output: true
    }
}
