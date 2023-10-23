package com.multithreading.producerconsumer;

public class Producer implements Runnable{
    private Shop shop;
    public Producer(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (shop) {
                if (shop.size < 5) {
                    shop.size += 1;
                    System.out.println("Producing Cloth. Now Shop Has:" + shop.size + " clothes");
                }
            }
        }

    }
}
