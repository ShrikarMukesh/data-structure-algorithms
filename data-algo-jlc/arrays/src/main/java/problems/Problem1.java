package problems;

//Reverse a Given Array
public class Problem1 {
    public static void main(String[] args) {
        int arr[] = {78,5,9,6,11,1333,34,5,6,777,32};
        System.out.println("before reverse");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            reverse(arr);
        }
        System.out.println("\nAfter reverse");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            reverse(arr);
        }
    }

    private static void reverse(int[] arr) {
        int n = arr.length;
        int start =0;
        int end = n-1;

        for(int i=0,j=n-1;i<j;i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
