package basic;

public class Lab6 {
    public static void main(String[] args) {
        int[] arr = {26,43,4,56,772,24,46,68};

        int position = 2;

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println("\nAfter delettion");
        int[] resultArray = delete(arr,position);

        for (int i=0;i<resultArray.length;i++){
            System.out.print(resultArray[i] + " ") ;
        }
    }

    private static int[] delete(int[] arr, int position) {
        int n = arr.length;
        int index = position -1;
        if(position > n){
            return arr;
        }
        for(int i=index;i<n-1;i++){
          arr[i] = arr[i+1];
        }
        arr[n-1] =0;
        return arr;
    }
}
