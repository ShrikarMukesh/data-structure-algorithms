package com.trees.faq;
class Employee{
    private static Employee instance;

    private Employee(){
        if (instance !=null){
            throw new IllegalStateException();
        }
    }
}
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
       /*
       SingletonClass singletonClass  = SingletonClass.getInstance();
        SingletonClass singletonClass1  = SingletonClass.getInstance();
        System.out.println(singletonClass);
        System.out.println(singletonClass1.clone());
        */
        SingletonClass singletonObject = SingletonClass.getInstance();
        SingletonClass st = (SingletonClass) singletonObject.clone();
        System.out.println(st);
    }

}
