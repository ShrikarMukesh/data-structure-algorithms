package com.numloops1;
//WAP to print the prime numbers between M to N.
public class Lab9 {
    public static void main(String[] args) {
        int m= 1; //Initial Condition
        int n = 25; //Exit Condition
        boolean flag = false;
        for(int num=m; num<=n; num++){
             flag = isPrime(num);
             if(flag == true){
                 System.out.print(num+" ");
             }
        }
    }

    private static boolean isPrime(int num) {
        int count = 0;
        boolean primeFlag=false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            primeFlag = true;
        }
        return primeFlag;
    }
}
