package problems;
//Reverse a given String words
public class Problem2 {

    public static void main(String[] args) {
        String str = "Hello Shrikar How Are You";
        char[]  charArry = str.toCharArray();
        reverseWords(charArry);
        String revStr = new String(charArry);
        System.out.println(revStr);
    }

    static void reverseWords(char[] charArray){
        int n = charArray.length;
        int start = 0;
        int end = 0;
        while(end < n){
            if(charArray[end] == ' '){
                reverse(charArray, start ,end-1);
                start = end+1;
            }
            end++;
        }
        reverse(charArray, start ,end-1);// This Reverse last String
        reverse(charArray, 0 ,n-1); // This Reverse Entire String
    }

    static void reverse(char charArray[], int start, int end){
        while (start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }
}
//Time comp ---- O(n)
//Aux space ---- O(n)