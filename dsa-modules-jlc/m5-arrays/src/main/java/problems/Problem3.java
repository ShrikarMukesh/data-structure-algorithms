package problems;

public class Problem3 {
    public static void main(String[] args) {
        int arr[] = { 10,15,0,0,25,0,20 };
        //int arr[] = { 10,15,25,20,0,0,0 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int nonZeroCount = moveZeros(arr);
        System.out.println("\n ");
        //Print All
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n ");
        //Print Non-Zeors
        for (int i = 0; i < nonZeroCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int moveZeros(int[] arr) {

        int temp =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int flag = arr[i];
                arr[i] = arr[temp];
                arr[temp] =flag;
                temp ++;
            }
        }
        return temp;
    }

}
