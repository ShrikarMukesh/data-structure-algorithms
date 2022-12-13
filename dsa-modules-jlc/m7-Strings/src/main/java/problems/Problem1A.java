package problems;

public class Problem1A {
    static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int n =charArray.length;
        int start = 0;
        int end = n-1;
        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        String revstr= new String(charArray);
       return revstr;
    }
    public static void main(String[] args) {
        String str = "Hello";
        String result = reverseString(str);
        System.out.println(result);
    }
}

//Time Complexity = O(n)
//Aux Space = O(n) //new charArray is created extra thats why it's O(n)
