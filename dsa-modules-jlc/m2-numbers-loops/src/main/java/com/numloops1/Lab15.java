package com.numloops1;

// 15) WAP to display the perfect numbers from m to n.
public class Lab15 {
    private static boolean isPerfect(int num) {
        int sum = 1;
        for (int i = 2; i <= num /2 ; i++) {
            if (num % i == 0) // i is having each number
                sum = sum + i;
        }
        if (sum == num)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        int m= 1;
        int n = 50;
        for(int k=m;k<=n;k++) {
            if(isPerfect(k)) {
                System.out.println(k);
            }
        }
    }
}