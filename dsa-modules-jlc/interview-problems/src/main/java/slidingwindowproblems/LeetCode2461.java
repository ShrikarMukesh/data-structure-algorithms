package slidingwindowproblems;

import java.util.*;

public class LeetCode2461 {
    public static void main(String[] args) {

        int[] nums = {1,5,4,2,9,9,9}; int k = 3;
        //prePareSubArrayList(nums, k);
        System.out.println(maxSumOfDistinctSubarrays(nums, k));
    }

    static int maxSumOfDistinctSubarrays(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return 0;

        int n = nums.length;
        int maxSum = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        int left = 0, right = 0;
        int sum = 0;

        while (right < n) {
            int num = nums[right];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            sum = sum + num;

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                int leftNum = nums[left];
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
                sum -= leftNum;
                left++;
            }

            right++;
        }

        return maxSum;
    }

    static List<List<Integer>> prePareSubArrayList(int[] nums, int k){
        List<List<Integer>> setList =  new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> integers = new LinkedList<>();
            int temp=k;
            int counter =i;
            int flag=0;
            while (temp>0){

                integers.add(flag ,nums[counter]);
                flag++;
                temp--;
                if(counter + i <= nums.length){
                    counter++;
                }
                else{
                    return setList;
                }
            }
            System.out.println(integers);
            setList.add(integers);
            System.out.println(setList);

        }
        return setList;
    }
}
