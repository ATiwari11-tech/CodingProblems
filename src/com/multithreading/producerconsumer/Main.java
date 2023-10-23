package com.multithreading.producerconsumer;

import javax.swing.plaf.TableHeaderUI;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread t1 = new Thread(new Producer(shop));
        Thread t2 = new Thread(new Consumer(shop));
        t1.start();
        t2.start();
    }
}
