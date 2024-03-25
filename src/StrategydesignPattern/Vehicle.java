package StrategydesignPattern;

import StrategydesignPattern.DriveStrategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

//    constructor injection
     Vehicle(DriveStrategy driveobj){
    this.driveObject = driveobj;
    }

    public void drive(){
         driveObject.Strategy();
    }
}
