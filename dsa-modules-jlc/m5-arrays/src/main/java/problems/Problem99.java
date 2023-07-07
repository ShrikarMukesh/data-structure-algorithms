package problems;

import java.util.HashMap;
import java.util.Map;

public class Problem99 {
    public static void findPairs(int[] arr, int target) {
       HashMap<Integer, Integer> integerHashMap = new HashMap<>();
       for (int i=0;i<arr.length;i++){
           int flag = target - arr[i];
           if(integerHashMap.containsKey(flag)){
               System.out.println("Pair found "+ arr[i] + " " + flag);
           }
           else {
               integerHashMap.put(arr[i] , i);
           }
       }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 9, 10, 1};
        int target = 11;

        System.out.println("Pairs with sum " + target + ":");
        findPairs(arr, target);
    }
}
