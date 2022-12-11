package com.problems;
//secondary diagonal
public class Problem2 {
    public static void main(String[] args) {
        //int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = mat.length;
        //main diagonal
        for (int i=0, j = n-1;i<n;i++,j--){
            System.out.print(mat[i][j] + "  ");
        }
    }
}
