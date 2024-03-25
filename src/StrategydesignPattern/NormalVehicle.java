package StrategydesignPattern;

import StrategydesignPattern.DriveStrategy.NormalDrive;

public class NormalVehicle extends Vehicle{

    NormalVehicle(){
        super(new NormalDrive());
    };
}
