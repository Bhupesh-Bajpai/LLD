package ParkingRazorpay.Entity;

import ParkingRazorpay.Enum.CarType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ParkingRazorpay.Enum.CarType.Suv;

public class ParkingLot {

    int suvCount;
    int hatchbackCount;
    Map<Integer,Car> parkedCars;


    public ParkingLot(int suvCount, int hatchbackCount){
    this.suvCount = suvCount;
    this.hatchbackCount = hatchbackCount;
    this.parkedCars = new HashMap<>();
    }


    public boolean parkCar(int slotNum, Car car){
        if(car.getCarType().equals(CarType.Suv)){
            if(suvCount > 0){
                parkedCars.put(slotNum,car);
                suvCount--;
                return true;
            }else{
                System.out.println("suvSlots got full. There is no slot available for park suv car");
                return false;
            }
        }else{
            if(hatchbackCount > 0){
                parkedCars.put(slotNum,car);
                hatchbackCount--;
                return true;
            }else{
                System.out.println("HatchBack got full. There is no slot available for park HatchBack car");
                return false;
            }
        }
    }


    public Car  removeCar(int slotNum, long ExitTime){
        Car car = parkedCars.remove(slotNum);
        if(car != null){
            car.setExitTime(ExitTime);
            if(car.getCarType().equals(CarType.Suv)){
                suvCount++;
            }else{
                hatchbackCount++;
            }

        }

        return car;
    }


    public  Map<Integer, Car> findAllCar(){

        return parkedCars;
    }



}
