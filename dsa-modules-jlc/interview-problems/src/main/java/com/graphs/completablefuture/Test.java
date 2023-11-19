package com.graphs.completablefuture;
//[5, 5, 1, 11]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5, 5, 1, 11};
        //22 -- 5
        //17 -- 5
        //12 -- 1
        //11 -- 11

        List<Integer> integerList = new ArrayList<>();
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            int flag = arr[i];

            int result =  calculateSum(arr, i+1);

            System.out.println("On Iteration "+result);
            if(result == flag){
                integerHashMap.put(arr[i], result);
            }
        }
        System.out.println(integerHashMap);
    }

    private static int calculateSum(int[] arr, int startFrom) {
        int result = 0;
        for (int i=startFrom;i<arr.length;i++){
            result = result + arr[i];
        }
        return result;
    }
}
