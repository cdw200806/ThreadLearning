package org.example;

import java.io.*;
import java.lang.reflect.Constructor;

public class Test2 {

    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();

        Class dc = dog.getClass();

        Constructor<Dog> dco = dc.getDeclaredConstructor();

        Dog dog2 = dco.newInstance();

        System.out.println(dog == dog2);
    }
}
