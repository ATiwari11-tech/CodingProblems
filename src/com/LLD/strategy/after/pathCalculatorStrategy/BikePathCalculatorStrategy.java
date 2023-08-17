package com.LLD.strategy.after.pathCalculatorStrategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println("Bike Path from :"+from+" to:"+to);
    }
}
