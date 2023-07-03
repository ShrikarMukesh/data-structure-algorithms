package com.problems;
//Rotate Left the matrix by 90 degree (Anti clock wise)
public class Problem7 {
    public static void main(String[] args) {
        //int[][] mat = {{1,2,3}, {4,5,6},{7,8,9}};
        int[][] mat = {{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int n = mat.length;
        System.out.println("Before rotateLeft90");
        printMatrix(mat);
        rotateLeft90(mat);
        System.out.println("After rotateLeft90");
        printMatrix(mat);
    }
    public static void printMatrix(int mat[][]){
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateLeft90(int[][] mat) {
        transposeMatrix(mat);
        reversecolumns(mat);

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
