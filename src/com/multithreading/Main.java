package com.multithreading;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> numbers = List.of(
                7,2,9,1,5,6
        );
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedArrayFuture = executorService.submit(new Sorter(numbers,executorService));//non-blocking call
        List<Integer> sortedArray = sortedArrayFuture.get();//blocking call
        for(Integer i:sortedArray){
            System.out.println(i);
        }
        executorService.shutdown();
    }
}
