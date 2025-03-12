package org.example;

import static java.lang.Thread.sleep;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Cat2 implements Runnable {


    public void miao() {

    }

    @Override
    public void run() {

        while (true) {
            System.out.println(Thread.currentThread().getName() + "m2");

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread cat2 = new Thread(new Cat2());
        cat2.start();
    }
}