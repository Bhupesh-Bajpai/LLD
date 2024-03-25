package ParkingLot.Entity;

import java.util.ArrayList;

public class TwoWheeleManager extends ParkingSpotManager{


    static ArrayList<PArkingSpot> twoWheelerList;


    public TwoWheeleManager(ArrayList<PArkingSpot> spotList, ArrayList<PArkingSpot> twoWheelerList) {
        super(spotList);
        this.twoWheelerList = twoWheelerList;
    }
}
