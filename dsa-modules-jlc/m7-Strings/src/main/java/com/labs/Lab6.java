package com.labs;
//String Buffer is ThreadSafe
//All the methods for String Buffer is Synchronized
public class Lab6 {
    public static void main(String[] args) {
        StringBuffer stringBuffer1 = new StringBuffer("JLC");
        StringBuffer stringBuffer2 = new StringBuffer("JLC");

        System.out.println(stringBuffer1 == stringBuffer2);
        System.out.println(stringBuffer1.equals(stringBuffer2));

        boolean b1 = stringBuffer1.toString().contentEquals(stringBuffer2.toString());

        boolean b2 = stringBuffer1.toString().equals(stringBuffer2.toString());

        System.out.println("b1 "+ b1);
        System.out.println("b2 "+ b2);

        stringBuffer1.append("h++");
        System.out.println(stringBuffer1);

    }
}
//ASCII
//a = 97  A = 65
//b = 98  B = 66
//c = 99  C = 67
//d = 100
