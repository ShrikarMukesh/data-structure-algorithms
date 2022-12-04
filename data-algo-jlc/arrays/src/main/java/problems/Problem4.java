package problems;
//isSorted
public class Problem4 {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,21};
        System.out.println("Original array");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + isSorted(arr));
}

    private static boolean isSorted(int[] arr) {
        int n = arr.length;
//        for (int i=0;i<n;i++){
//            if(arr[i] < arr[i+1]){
//                return false;
//            }
//        }
        for (int i=1;i<n;i++){
            if(arr[i-1] > arr[i]){
                return false;
            }
        }
        return true;
    }
    }
