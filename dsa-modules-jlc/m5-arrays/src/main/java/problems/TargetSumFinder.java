package problems;

import java.util.ArrayList;
import java.util.List;

public class TargetSumFinder {
    public static List<Integer> findElements(int[] arr, int target) {
        List<Integer> elements = new ArrayList<>();
        findElementsHelper(arr, target, 0, elements);
        return elements;
    }

    private static boolean findElementsHelper(int[] arr, int target, int index, List<Integer> elements) {
        if (target == 0) {
            return true;  // Base case: target sum reached
        }

        if (index >= arr.length || target < 0) {
            return false;  // Base case: end of array or target sum exceeded
        }

        // Include the current element and recursively search for the remaining sum
        elements.add(arr[index]);
        if (findElementsHelper(arr, target - arr[index], index + 1, elements)) {
            return true;  // Found a combination
        }

        // Exclude the current element and recursively search for the remaining sum
        elements.remove(elements.size() - 1);
        return findElementsHelper(arr, target, index + 1, elements);
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 5, 9, 10, 1,5,6,7};
        int target = 15;

        System.out.println("Elements that sum up to " + target + ":");
        List<Integer> elements = findElements(arr, target);
        System.out.println(elements);
    }
}

