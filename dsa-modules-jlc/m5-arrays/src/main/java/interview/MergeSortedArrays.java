package interview;

public class MergeSortedArrays {
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while (i< arr1.length && j< arr2.length){
            if(arr1[i] < arr2[j]){
                result[k++] = arr1[i++];
            }
            else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] mergedArr = mergeSortedArrays(arr1, arr2);
        for (int i = 0; i < mergedArr.length; i++) {
            System.out.print(mergedArr[i] +" ");
        }
    }
}
