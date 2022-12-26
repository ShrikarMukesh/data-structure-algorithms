package problems;
//check weather the given string is pallindrome or Not
public class Problem4A {
    public static void main(String[] args) {
        String str1  = "gadag";
        boolean b1 = isPalindrome(str1);
        System.out.println(b1);
    }

    private static boolean isPalindrome(String str1) {
        String givenString = str1;
        StringBuilder stringBuilder = new StringBuilder(str1);
        stringBuilder = stringBuilder.reverse();
        return stringBuilder.equals(givenString);
    }
}
