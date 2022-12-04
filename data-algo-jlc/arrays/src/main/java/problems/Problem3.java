package problems;
//Move all Zeros to end
public class Problem3 {
    public static void main(String[] args) {
        int arr[] = {10,20,20,20,30,30,40,50,60,60,70,70};
        System.out.println("Original array");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        int newlength = moveZeros(arr);

        System.out.println("\nAfter");
        for (int i=0;i<newlength;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static int moveZeros(int[] arr) {
        int n  = arr.length;
        int tempCount = 1;
        for(int i=1;i<n;i++){
            if(arr[i] == 0){
                arr[tempCount] = arr[i];
                tempCount++;
            }
            else {
                arr[i] =0;
            }
        }
        return tempCount;
    }
}
