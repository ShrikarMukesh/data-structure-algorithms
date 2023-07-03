package com.numloops1;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 89;
        int flag = 0;
        for(int i = 2; i<num /2 ; i++){
            if (num % i == 0){
                flag++;
            }
        }
        if (flag>0){
            System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }
    }
}
