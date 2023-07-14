package com.dsa.fiveWaysToCreateObject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ThirdWay {
    String str = "hello world";

    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<ThirdWay> wayConstructor = ThirdWay.class.getConstructor();
        ThirdWay obj1 = wayConstructor.newInstance();
        System.out.println(obj1.str);
    }
}
