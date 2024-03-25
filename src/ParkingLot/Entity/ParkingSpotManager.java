package ParkingLot.Entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class ParkingSpotManager {

    static ArrayList<PArkingSpot> spotList;


    public ParkingSpotManager(ArrayList<PArkingSpot> spotList) {
        this.spotList = spotList;
    }


    public void findParkingSpace(){

    }

    public void addParkingSpace(){

    }

    public void removeParkingSpace(){

    }

    public void parkVehicle(Vehicle vehicle){

    }

    public void removeVehicle(){

    }
}
