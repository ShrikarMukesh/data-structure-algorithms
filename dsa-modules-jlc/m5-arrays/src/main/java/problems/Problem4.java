package problems;

public class Problem4 {
    static boolean isSorted(int arr[]) {
        int n = arr.length;
        for(int i=1;i<n;i++) {
            if(arr[i-1]>arr[i]) {
                return false;
            }
        }
        return true;
    }
    static boolean isSorted1(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //int arr[] = { 10,20,30,40,50 };
       int arr[] = { 10,20,30,50,40 };
        //boolean flag = isSorted(arr);
        boolean flag = isSorted1(arr);
        if(flag)
            System.out.println("Yes Sorted");
        else
            System.out.println("Not Sorted");
    }
}
// Time Complexity - - O(n)
// Aux Space - O(1)