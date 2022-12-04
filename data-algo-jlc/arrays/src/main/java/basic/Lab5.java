package basic;

public class Lab5 {
    public static void main(String[] args) {
        int[] arr = {26,43,4,56,772,24,46,68};
        int element = 99;
        int position = 2;
        int[] resultArray = insert(arr,element,position);
        for (int i=0;i<resultArray.length;i++){
            System.out.println(resultArray[i]);
        }
    }

    private static int[] insert(int[] arr, int element, int position) {
        int n = arr.length;
        int index = position -1;

        int tempArr[] = new int[n+1];

        for(int i = n-1;n>index;i--){
            tempArr[i] = tempArr[i -1];
        }
        //insert
        tempArr[index] =element;

        for (int i=0;i<index;i++){
            tempArr[i] = arr[i];

        }
        return tempArr;
    }
}
