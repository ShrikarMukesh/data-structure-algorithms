package com.numloops1;

// 4. WAP to Print the Even Numbers from 1 to N.

class Lab4 {
    public static void main(String as[]) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}