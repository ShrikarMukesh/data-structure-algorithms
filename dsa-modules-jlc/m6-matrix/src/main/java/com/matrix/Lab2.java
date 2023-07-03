package com.matrix;
//print 2D- Array
public class Lab2 {
    public static void main(String[] args) {

        //creating 2-D array
        int arr[][] = new int[3][4];

        //accessing elements
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //initializing 1st array/1st row
        arr[0][0] = 12;
        arr[0][1] = 89;
        arr[0][2] = 2;

        //initializing 2nd array/2nd row
        arr[1][0] = 9;
        arr[1][1] = 839;
        arr[1][2] = 363;

        arr[2][0] = 34;
        arr[2][1] = 565;
        arr[2][2] = 433;

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
