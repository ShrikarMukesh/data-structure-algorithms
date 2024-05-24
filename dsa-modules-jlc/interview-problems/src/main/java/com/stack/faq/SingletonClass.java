package com.stack.faq;

import java.io.Serializable;
/*
1. The Serializable interface is implemented to allow serialization and deserialization.
   However, we customize the deserialization process to prevent the creation of new instances.
2. The readResolve() method is implemented, which is called during deserialization.
   It returns the existing singleton instance using the getInstance() method, effectively preventing the creation of multiple instances.
3. The clone() method is overridden to throw a CloneNotSupportedException, which prevents cloning of the singleton instance.
   With these additional implementations, cloning the singleton object or attempting to create a new instance through deserialization will result in
   exceptions being thrown.

Please note that serialization and deserialization can introduce security risks, so it's important to consider the implications and potential vulnerabilities when applying these mechanisms to a singleton class.
 */
public class SingletonClass implements Serializable {
    private static final long serialVersionUID = 1L;

    public static String name;
    private static SingletonClass instance;

    private SingletonClass() {
        // Private constructor to prevent instantiation from outside the class
        if (instance != null) {
            throw new IllegalStateException("Singleton instance already exists");
        }
    }

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }

    protected Object readResolve() {
        // Prevents deserialization from creating a new instance
        return getInstance();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Prevents cloning of the instance
        throw new CloneNotSupportedException("Cloning of singleton instance is not allowed");
    }

    // Other methods and attributes of the class
}

