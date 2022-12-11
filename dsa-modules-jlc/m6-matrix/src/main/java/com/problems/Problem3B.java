package com.problems;
//print sum od diagonal elements of n*n matrix
//1572.Leetcode Problem
public class Problem3B {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
        int n = mat.length;
        int sum =0;

        for (int i=0,j=n-1;i<n;i++,j--){
            if(i != j){
                sum = sum + mat[i][i] + mat[i][j];
            }
            else{
                sum = sum + mat[i][i];
            }
        }
        System.out.println("Total sum " + sum);
    }
}
