package ParkingLot.Entity;

import java.util.ArrayList;

public class FourWheelManager extends ParkingSpotManager{
    static
    ArrayList<PArkingSpot> fourWheelerList;


    public FourWheelManager(ArrayList<PArkingSpot> spotList, ArrayList<PArkingSpot> fourWheelerList) {
        super(spotList);
        this.fourWheelerList = fourWheelerList;
    }
}
