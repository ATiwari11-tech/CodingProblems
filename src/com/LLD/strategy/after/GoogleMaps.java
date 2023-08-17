package com.LLD.strategy.after;

import com.LLD.strategy.after.pathCalculatorStrategy.PathCalculatorStrategy;
import com.LLD.strategy.after.pathCalculatorStrategy.PathCalculatorStrategyFactory;

public class GoogleMaps {
    public void findPath(String from, String to, Modes mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorStrategyFactory.getStrategy(mode);
        pathCalculatorStrategy.findPath(from,to);
    }
}
