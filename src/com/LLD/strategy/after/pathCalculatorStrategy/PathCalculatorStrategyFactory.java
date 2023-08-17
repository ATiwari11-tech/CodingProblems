package com.LLD.strategy.after.pathCalculatorStrategy;

import com.LLD.strategy.after.Modes;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getStrategy(Modes mode){
        switch(mode){
            case CAR:
                return new CarPathCalculatorStrategy();
            case WALK:
                return new WalkPathCalculatorStrategy();
            case BIKE:
                return new BikePathCalculatorStrategy();
            default:
                return null;
        }
    }
}
