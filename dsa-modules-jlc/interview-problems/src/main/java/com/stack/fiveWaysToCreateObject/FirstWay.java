package com.stack.fiveWaysToCreateObject;

/*How many Ways to Create an Object in Java
        There are five different ways to create an object in Java:

        Java new Operator
        Java Class.newInstance() method
        Java newInstance() method of constructor
        Java Object.clone() method
        Java Object Serialization and Deserialization

 */
public class FirstWay {
    public static void main(String[] args) {
        FirstWay firstWay = new FirstWay();
        System.err.println(firstWay);
    }
}
