package com.problems;
//transpose of a Matrix
//Swap the Rows to columns AND columns to Rows
//867 . Leetcode problem

public class Problem6 {
    public static void main(String[] args) {
        //int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int n = mat.length;
        System.out.println("Before transposeMatrix");
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        transposeMatrix(mat);
        System.out.println("After transposeMatrix");
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transposeMatrix(int[][] mat){
        int n = mat.length;

        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }


}
