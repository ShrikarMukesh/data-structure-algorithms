package basic;

public class Lab4 {
    public static void main(String[] args) {
        int[] arr = {26,43,4,56,772,24,46,68};
        int element = 4;
        int index = linearSearch(arr , element);
        if(index == -1){
            System.out.println("Not Found ");
        }
        else {
            System.out.println("Elemet found at " + index);
        }
    }

    private static int linearSearch(int[] arr, int element) {
        for (int i=0;i<arr.length;i++){
            if(arr[i] ==element){
                return i;
            }
        }
        return -1;
    }
}
//T C : O(n)
//Aux Spece complixity : O(1)
// B