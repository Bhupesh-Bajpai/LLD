package ParkingRazorpay;

import ParkingRazorpay.Entity.Car;
import ParkingRazorpay.Entity.ParkingLot;
import ParkingRazorpay.Enum.CarType;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Design a car parking application
//
//There are two categories of cars: SUV and hatchback.
//Maintain a count of how many SUV and hatchback cars enter the premise
//Calculate the payment each car has to make based upon the rates as hatchback parking as 10 rupees per hour and SUV being 20 rupees an hour.
//In case if hatchback occupancy is full then hatchback cars can occupy SUV spaces but with hatchback rates.
//During exit there needs to be the system to inform the user how much they have to pay
//Admin can see all the cars which are parked in the system


        ParkingLot parkingLot = new ParkingLot(5,10);

        Car car1 = new Car("Suv",System.currentTimeMillis());
        int slotNum = 1;
        Car car2 = new Car("Suv",System.currentTimeMillis());
        int slotNum2 = 2;

        parkingLot.parkCar(slotNum,car1);
        parkingLot.parkCar(slotNum2,car2);

        Car existedCar = parkingLot.removeCar(1,System.currentTimeMillis());

        if(existedCar != null){
            long totalParktime =( existedCar.getExitTime() - car1.getEntryTime())/(1000 * 60 * 60);

            int Cost = existedCar.getCarType().equals(CarType.Suv) ? 20 * (int)totalParktime : 10 * (int)totalParktime;

            System.out.println("Payment for Car: "+ slotNum + "cost for parking "+ Cost);

        }








        Map<Integer,Car> parkedCar = parkingLot.findAllCar();

        for(Map.Entry<Integer,Car> entry : parkedCar.entrySet() ){
            System.out.println("entryKey : "+entry.getKey()+" "+"Car Type :"+ entry.getValue().getCarType()+" " +
                    "Car Entry Time :" + entry.getValue().getEntryTime());

        }




    }
}
