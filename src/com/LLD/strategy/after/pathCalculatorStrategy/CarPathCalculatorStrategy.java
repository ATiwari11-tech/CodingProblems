package com.LLD.strategy.after.pathCalculatorStrategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findPath(String from, String to) {
        System.out.println("Car Path from:"+from+" to:"+to);
    }
}
