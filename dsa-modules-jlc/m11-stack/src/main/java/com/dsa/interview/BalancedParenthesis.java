package com.dsa.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String string1 = "{[()()]}";
        String string2 = "{[(])}";
        String string3 = "{[()[]]}()";
        String string4 = "{[(9)[787]shrikar]12}(56[]00)";

//        System.out.println(balancedParenthesis(string1));  // Output: true
//        System.out.println(balancedParenthesis(string2));  // Output: false
//        System.out.println(balancedParenthesis(string3));  // Output: true
//        System.out.println(balancedParenthesis(string4));  // Output: true
        System.out.println(balancedParenthesis("[SHR]9{4}7(40)"));
    }

    public static boolean balancedParenthesis(String str) {

        Stack<Character> characterStack  = new Stack<>();

        Map<String, String> stringStringMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if(ch == '{' || ch == '(' || ch == '['){
                characterStack.push(ch);
                continue;
            }
            if(characterStack.isEmpty()) {
                return false;
            }
            char check;

            switch (ch){
                case ')' :
                    check = characterStack.pop();
                    if(check == '{' || check == '[') {
                        return false;
                    }
                    break;
                case '}' :
                    check = characterStack.pop();
                    if(check == '(' || check == '[') {
                        return false;
                    }
                    break;
                case ']' :
                    check = characterStack.pop();
                    if(check == '{' || check == ')') {
                        return false;
                    }
                    break;
            }

        }
        if(characterStack.isEmpty()){
            return true;
        }
        return false;
        //return (characterStack.isEmpty());
    }
}
