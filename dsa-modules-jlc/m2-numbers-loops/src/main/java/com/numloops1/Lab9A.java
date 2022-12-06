package com.numloops1;

// 9A) WAP to print the prime numbers between M to N.
/*
 * @Author : Srinivas Dande
 * @Company: Java Learning Center
 * */
class Lab9A {
        public static void main(String[] args) {
            int m= 10;
            int n = 25;
            for (int num = m; num <= n; num++) {
                if (isPrime(num)) {
                    System.out.println(num);
                }
            }
        }
        private static boolean isPrime(int num) {
        boolean primeFlag=true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                primeFlag=false;
                break;
            }
        }
        return primeFlag;
    }
}