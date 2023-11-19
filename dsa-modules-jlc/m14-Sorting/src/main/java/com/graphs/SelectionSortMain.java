package com.graphs;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        System.out.println("Before Sorting : ");
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestElement = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallestElement]) {
                    smallestElement = j;
                }
            }
            //Swap Function
            int smallerNumber = arr[smallestElement];
            arr[smallestElement] = arr[i];
            arr[i] = smallerNumber;
        }
        System.out.println();
        System.out.println("After Sorting : ");
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
