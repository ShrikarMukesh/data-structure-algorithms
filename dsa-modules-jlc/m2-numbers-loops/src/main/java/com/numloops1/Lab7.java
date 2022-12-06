package com.numloops1;

// 7. WAP to Find the Number of Divisibles of the given Number.
class Lab7 {
    public static void main(String as[]) {
        int n = 10;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count ++;
        }
        System.out.println("Count : "+ count);
    }
}