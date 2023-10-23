package com.multithreading.addersubtractorlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(new Adder(c,lock));
        Thread t2 = new Thread(new Subtractor(c,lock));
        t1.start();
        t2.start();
        t1.join();//main thread waits for t1 to complete i.e. code won't go to next line till it completes
        t2.join();//main thread waits for t2 to complete i.e. code won't go to next line till it completes
        System.out.println(c.value);
    }
}
