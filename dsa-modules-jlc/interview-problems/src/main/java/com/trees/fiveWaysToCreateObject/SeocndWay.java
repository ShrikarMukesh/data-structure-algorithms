package com.trees.fiveWaysToCreateObject;

//Java Class.newInstance() is the method of Class class. The Class class belongs to java.lang package.
// It creates a new instance of the class represented by this Class object. It returns the newly created instance of the class.

//public T newInstance() throws IllegalAcccessException, InstantiationException

public class SeocndWay {
    String str="hello";
    static String demo = "Shrikar Mukesh";

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
//        try{
//            SeocndWay seocndWay = SeocndWay.class.newInstance();
//            System.out.println(seocndWay.str);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        SeocndWay seocndWay = SeocndWay.class.newInstance();
    }
}
