package com.LLD.strategy.after.pathCalculatorStrategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{

    @Override
    public void findPath(String from, String to) {
        System.out.println("Walk Path from:"+from+" to:"+to);
    }
}
