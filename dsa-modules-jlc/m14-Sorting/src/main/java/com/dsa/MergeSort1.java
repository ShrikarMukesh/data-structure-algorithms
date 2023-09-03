package com.dsa;

import java.util.Arrays;

import static com.dsa.MergeSort.merge;

public class MergeSort1 {

    private static void mergeSort(int[] arr, int low, int high) {
        int mid = (low + high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {10,5,30,15,7};
        int low =0;
        int high =arr.length-1;
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, low, high);
    }
}
