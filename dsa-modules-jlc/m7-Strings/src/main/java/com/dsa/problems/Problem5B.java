package com.dsa.problems;

//Check weather Given Strings are anagrams or not
public class Problem5B {
    public static void main(String[] args) {

        System.out.println('c' - 96);
        String str1 = "sri";
        String str2 = "sir";
        boolean b1 = isAnagram(str1,str2);
        System.out.println("The given Strings are palindrome " + b1);
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()){
            return false;
        }
        int counter[] = new int[26];

        for (int i=0; i< str1.length(); i++){
            //counter[str1.charAt(i) - 'a']++;
            counter[str1.charAt(i) - 97]++;
            counter[str2.charAt(i) - 'a']--;
        }
        for(int c = 0;c < counter.length;c++){
            if(counter[c] != 0){
                return false;
            }
        }
        return true;
    }
}
//Time complexity :
//Aux space :