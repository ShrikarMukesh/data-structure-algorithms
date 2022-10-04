package com.binarytree;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;

@Slf4j
public class Test {
    public static void main(String[] args) {
        int n = 10;
        int count =0;
        for(int i=2;i<n/2;i++){
            if(n % i == 0){
                count++;
                return;
            }
        }
        if(count == 0 ){
            System.out.println(n + "is prime ");
        }
    }
}
