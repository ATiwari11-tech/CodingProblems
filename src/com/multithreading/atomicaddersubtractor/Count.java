package com.multithreading.atomicaddersubtractor;

import java.util.concurrent.atomic.AtomicInteger;

public class Count {
//    int value = 0;
    AtomicInteger value = new AtomicInteger(0);
    public void addValue(int i){
        this.value.addAndGet(i);
//        this.value += i;
    }
}
