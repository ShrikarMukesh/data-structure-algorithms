package com.problems;
//print the daigonal of n*n matrix
public class Problem1A {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};

        //main Daigonal
        for (int i=0;i<mat.length;i++){
            System.out.print(mat[i][i] + " ");
        }
    }
}
//Time Comp : O(n)
//Aux space : O(1)