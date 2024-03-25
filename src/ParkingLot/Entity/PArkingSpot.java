package ParkingLot.Entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PArkingSpot {

    int id;
    boolean isEmpty;
    Vehicle vehicle;
    int price;

    public void parkVehicle(){

    }

    public void removeVehicle(){

    }
}
