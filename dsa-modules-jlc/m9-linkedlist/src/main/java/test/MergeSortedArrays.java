package test;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {11,22,33,44,55};

        int[] arr3 = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while (i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2 [j]){
                arr3[k] = arr1[i];
                i++;k++;
            }
            else {
                arr3[k] = arr2[j];
                j++;k++;
            }
        }

        for(int p =0;p<arr3.length;p++){
            System.out.println(arr3[p]);
        }
    }
}
