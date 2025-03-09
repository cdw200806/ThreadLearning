package org.example;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws Exception {
        Dog dog = new Dog();

        OutputStream os = new FileOutputStream("./a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(dog);
        oos.close();
        os.close();


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./a.txt"));
        Dog dog2 = (Dog) ois.readObject();
        ois.close();

        System.out.println(dog == dog2);
    }
}
