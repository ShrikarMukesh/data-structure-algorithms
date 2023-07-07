package problems;

public class Prob1B {
    static void reverse(int arr[]) {
        for(int i=0, j = arr.length-1;i<j; i++, j--){
            int temp = arr[i];
            arr[j] = arr[i];
            arr[i] =temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 ,89};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println( "\n ");

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
