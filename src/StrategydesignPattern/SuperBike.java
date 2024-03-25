package StrategydesignPattern;

import StrategydesignPattern.DriveStrategy.SuperCarDrive;

public class SuperBike extends Vehicle{
    SuperBike(){
        super(new SuperCarDrive());
    }
}
