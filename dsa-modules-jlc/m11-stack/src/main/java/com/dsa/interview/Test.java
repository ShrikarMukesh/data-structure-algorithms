package com.dsa.interview;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        System.out.println(balancedPara("[]{}()"));
        System.out.println(balancedPara("[(]{}()"));
        System.out.println(balancedPara("[SHR]9{4}7(40)"));
    }
    public static boolean balancedPara(String str){

        Stack<Character> characterStack = new Stack<>();
        for (char c : str.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                characterStack.push(c);
                continue;
            }

            if (characterStack.isEmpty()) return false;
            char falg;

            switch (c){
                case ')':
                    falg = characterStack.pop();
                    if(falg == '{' || falg =='['){
                        return false;
                    }
                    break;
                case ']':
                    falg = characterStack.pop();
                    if(falg == '(' || falg =='{'){
                        return false;
                    }
                    break;
                case '}':
                    falg = characterStack.pop();
                    if(falg == '[' || falg =='('){
                        return false;
                    }
                    break;
            }
        }
        return characterStack.isEmpty();
    }
}
