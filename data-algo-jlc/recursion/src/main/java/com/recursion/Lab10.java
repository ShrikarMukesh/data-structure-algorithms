package com.recursion;
//Find sum of Individual Digits of Given Number
// n =135 =>
public class Lab10 {
    static int  digitSum(int n){
        int sum =0;
        while(n > 0){
            sum = sum + n% 10;
            n = n /10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int n =125;
        int fact = digitSum(n);
        System.out.println(fact);
    }
}
