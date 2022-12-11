package com.labs;

public class Lab4 {
    public static void main(String[] args) {
        String str1 = "shrikarmukesh";
        System.out.println(str1.length());
        char[] charsArray = str1.toCharArray();

        for (int i=0;i<charsArray.length;i++){
            System.out.print(charsArray[i] +" ");
        }
        System.out.println("\n");
        charsArray[0] = 'K';
        charsArray[8] = 'D';
        for (int i=0;i<charsArray.length;i++){
            System.out.print(charsArray[i] +" ");
        }

    }
}
