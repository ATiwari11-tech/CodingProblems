package com.multithreading.producerconsumer;

public class Consumer implements Runnable {
    private Shop shop;
    public Consumer(Shop shop){
        this.shop = shop;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (shop) {
                if (shop.size > 0) {
                    shop.size -= 1;
                    System.out.println("Buying cloth. Now Shop Has:" + shop.size + " clothes");
                }
            }
        }
    }
}
