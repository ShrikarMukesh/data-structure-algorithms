package problems;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
//Move All Zeros to End
public class Problem3A {
    public static void main(String[] args) {
        int arr[] = { 10,15,0,0,25,0,20 };
        //int arr[] = { 10,15,25,20,0,0,0 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //int nonZeroCount =
        //moveZeros(arr);
        moveZerosToEnd(arr);
//        System.out.println("\n ");
//        //Print All
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println("\n ");
//        //Print Non-Zeors
//        for (int i = 0; i < nonZeroCount; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
    private static int moveZeros(int[] arr) {
        int result = 0;
        LinkedList<Integer> integers = new LinkedList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int i : arr) {
            if (i != 0){
                integers.add(i);
            }else{
                integers1.add(i);
            }
        }
        integers.addAll(integers1);
        System.out.println(integers);
        return result;
    }
    public static void moveZerosToEnd(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i: arr){
            list.add(i);
        }
        int n = list.size();
        int i = 0;

        while (i < n) {
            if (list.get(i) == 0) {
                list.remove(i);
                n--;
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            list.add(0);
        }
        System.out.println();
        System.out.println(list);
    }
}
