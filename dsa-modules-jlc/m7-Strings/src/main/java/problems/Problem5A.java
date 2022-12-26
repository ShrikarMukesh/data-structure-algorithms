package problems;

import java.util.Arrays;
//Check weather Given Strings are anagrams or not
public class Problem5A {
    public static void main(String[] args) {

        String str1 = "sri";
        String str2 = "sir";
        boolean b1 = isAnagram(str1,str2);
        System.out.println("The given Strings are palindrome" + b1);
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        char charArr1[] = str1.toCharArray();
        Arrays.sort(charArr1);
        str1 = new String(charArr1);

        char charArr2[] = str2.toCharArray();
        Arrays.sort(charArr2);
        str2 = new String(charArr2);
        return str1.equals(str2);
    }
}
