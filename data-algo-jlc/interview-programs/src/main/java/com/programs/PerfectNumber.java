package com.programs;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6, sum =0;
        for(int i=1;i< num;i++){
            if(num % i  == 0){
                sum = sum + i;
            }
        }
        if(num == sum ){
            System.out.println("per num" + num);
        }else {
            System.out.println("not per num " + num);
        }
    }
}
