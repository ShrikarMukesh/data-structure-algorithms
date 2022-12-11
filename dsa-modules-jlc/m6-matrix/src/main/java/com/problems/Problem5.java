package com.problems;
//Reverse the rows of matrix
public class Problem5 {
    public static void main(String[] args) {
        //int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int n = mat.length;
        System.out.println("Before Reversal");
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        reversecolumns(mat);
        System.out.println("After Reversal");
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void reversecolumns(int[][] mat){
        int n = mat.length;

        for (int i=0;i<n;i++){
            int start = 0;
            int end = n -1;
            while (start<end){
                int temp = mat[start][i];
                mat[start][i] = mat[end][i];
                mat[end][i] = temp;
                start++;
                end--;
            }
        }
    }
}
