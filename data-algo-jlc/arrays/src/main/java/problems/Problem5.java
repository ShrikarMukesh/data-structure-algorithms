package problems;

//leftRotate
public class Problem5 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,21};
        System.out.println("Original array");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
       leftRotate(arr);
        System.out.println("\nAfter  leftRotate");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
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
//Tme C : O(n)
//Aux Spe  : O(1) No extra array taken