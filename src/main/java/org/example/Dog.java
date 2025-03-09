package org.example;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

import static java.lang.Thread.sleep;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id" // 指定唯一标识符字段
)
@Data
public class Dog implements Runnable, Serializable {

    private String id = UUID.randomUUID().toString();
    private Dog friend;
    private static Integer gouliang = 5;


    private synchronized void chi() {
        while (gouliang > 0) {

            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "吃");
            gouliang--;
            System.out.println("狗粮：" + gouliang);
        }
    }

    @Override
    public void run() {
        chi();
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();

        Thread thread1 = new Thread(dog1);
        Thread thread2 = new Thread(dog1);
        Thread thread3 = new Thread(dog1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}