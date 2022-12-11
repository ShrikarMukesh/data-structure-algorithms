package com.problems;
//print sum od diagonal elements of n*n matrix
public class Problem3A {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
        int n = mat.length;
        int sum =0;

        // main diagonal
        for (int i=0;i<n;i++){
            sum = sum + mat[i][i];
        }
        // secondary diagonal
        for (int i=0,j=n-1;i<n;i++,j--){
            if(i != j){
                sum = sum + mat[i][j];
            }
        }
        System.out.println("Total sum " + sum);
    }
}
