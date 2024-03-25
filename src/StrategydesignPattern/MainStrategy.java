package StrategydesignPattern;

public class MainStrategy {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle();
        vehicle.drive();
    }
}


// we use this pattern when child have same code but we did not have inside base code so we use it this in future we will
// use code reusable......
