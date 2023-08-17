package com.LLD.strategy.before;

public class GoogleMaps {
    public void findPath(String from, String to,Modes mode){//Violates SRP and OCP
        if(mode.equals(Modes.CAR)){
            System.out.print("Finding Mode for CAR");
        }
        else if(mode.equals(Modes.BIKE)) {
            System.out.print("Finding Mode for BIKE");
        }
        else if(mode.equals(Modes.WALK)) {
            System.out.print("Finding Mode for WALK");
            ////
            ///
            //
            ///
        }
    }
}
