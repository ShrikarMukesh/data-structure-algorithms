package com.programs;

public class Evaluate {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int flag = n/2;
                if(flag == j){
                    System.out.print("*" + " ");
                }else{
                    System.out.print("_");
                }

            }
            System.out.println();
        }
    }

}
