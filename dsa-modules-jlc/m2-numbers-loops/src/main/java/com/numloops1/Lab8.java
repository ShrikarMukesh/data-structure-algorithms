package com.numloops1;
// 8. WAP to Find whether given Number is Prime or Not.
/*
A prime number is a number that is only divisible by 1 and itself.
So, prime numbers have only two factors, 1 and the number itself.
 */
public class Lab8 {
    public static void main(String[] args) {
        int n = 17;
        int count = 0;
        for (int i =2;i<=n/2;i++){
            if(n % i == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println(n + " The Given number is prime");
        }else{
            System.out.println(n + " Not Prime");
        }
    }
}
