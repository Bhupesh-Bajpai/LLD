package StrategydesignPattern.DriveStrategy;

import java.sql.SQLOutput;

public class SuperCarDrive implements DriveStrategy{
    @Override
    public void Strategy() {
        System.out.println("Superbike drive....");
    }
}
