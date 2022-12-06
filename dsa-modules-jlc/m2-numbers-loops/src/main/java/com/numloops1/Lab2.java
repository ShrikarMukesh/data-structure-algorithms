package com.numloops1;

// 2. WAP to find Max of Two Numbers.
class Lab2 {
    public static void main(String as[]) {
        int a=20;
        int b=10;
        int max = 0;
        if(a!=b) {
            if(a>b) {
                max= a;
            }
            else {
                max=b;
            }
            System.out.println("Max : "+max);
        }
        else {
            System.out.println("Both are Same ");
        }
    }
}