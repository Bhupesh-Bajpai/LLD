package ParkingLot.Entity;

import lombok.Getter;
import lombok.Setter;

import static ParkingLot.Entity.FourWheelManager.fourWheelerList;
import static ParkingLot.Entity.ParkingSpotManager.spotList;
import static ParkingLot.Entity.TwoWheeleManager.twoWheelerList;


@Getter
@Setter
public class ParkingSpotFactory {



     ParkingSpotManager parkingSpotManager;
     PArkingSpot pArkingSpot;

     String vehicleType;

    public ParkingSpotManager getParkingSpotManager(Vehicle vehicle) {
        vehicleType = String.valueOf(vehicle.getVehicleType());
        switch (vehicleType){
            case "TwoWheeler":
                return new TwoWheeleManager( spotList,  twoWheelerList);
            case "FourWheeler":
                return new FourWheelManager(spotList,fourWheelerList);
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: " + vehicleType);
        }
    }
}
