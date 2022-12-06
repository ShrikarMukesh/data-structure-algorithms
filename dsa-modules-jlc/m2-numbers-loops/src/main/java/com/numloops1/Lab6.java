package com.numloops1;

// 6. WAP to Print Divisibles of the given Number.
class Lab6 {
    public static void main(String as[]) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}