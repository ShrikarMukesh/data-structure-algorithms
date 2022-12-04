package problems;

public class Problem5A {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,21};
        int k =3; // Kth Times
        System.out.println("Original array");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        leftRotate(arr,k);


        System.out.println("\nAfter  leftRotate");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    private static void leftRotate(int[] arr,int k) {
        for(int i=0;i<k;i++){
            leftRotate(arr);
        }
    }
    private static void leftRotate(int[] arr) {
        int n = arr.length;
        int temp = arr[0];
        for (int i=1;i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1]= temp;
    }
}
