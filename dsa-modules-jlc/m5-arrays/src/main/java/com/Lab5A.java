package com;

public class Lab5A {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int pos = 1, elem = 23;
        for(int i=0;i<arr.length;i++){
            if(i==pos){
                arr[pos] = elem;
                for(int j = i+1;j<arr.length-1;j++){
                    arr[j] = arr[j+1];
                }
                break;
            }

        }
        for (int i: arr){
            System.out.println(i);
        }
    }

}
