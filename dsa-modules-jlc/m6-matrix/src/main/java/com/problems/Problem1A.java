package com.problems;
//print the daigonal of n*n matrix
public class Problem1 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if( i == j){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}
//Time Comp : O(n2)
//Aux space : O(1)
