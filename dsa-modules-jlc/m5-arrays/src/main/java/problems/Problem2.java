package problems;

//Remove the Duplicates from Sorted Array
public class Problem2 {
    static int removeDuplicates(int arr[]) {
        int n = arr.length;
        int temp = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[temp - 1]) {
                arr[temp] = arr[i];
                temp++;
            }
            arr[i]=0;
        }
        return temp;
    }
    public static void main(String[] args) {
        int arr[] = { 0,0,10, 10, 20, 20, 20, 30, 40, 40, 40 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int tempCount = removeDuplicates(arr);
        System.out.println(" \n ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" \n ");
        for (int i = 0; i < tempCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
// Time Complexity - - O(n)
// Aux Space - O(1)