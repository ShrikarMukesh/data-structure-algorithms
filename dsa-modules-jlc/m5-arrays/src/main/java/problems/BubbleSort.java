package problems;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {50,30,10,20,10,40};

        for (int i=0;i<arr.length;i++){
             for (int j = 0; j < arr.length-i-1;j++){
                 if(arr[j] > arr[j+1]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
             }
        }
        for (int k : arr){
            System.out.println(k);
        }
    }
}
