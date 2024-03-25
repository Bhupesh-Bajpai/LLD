package ParkingLot.Entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ticket {

    long entryTime;
    Vehicle vehicle;

    PArkingSpot parkingSpot;

    public Ticket(long entryTime, Vehicle vehicle, PArkingSpot parkingspot) {

        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingspot;
    }


    public String genrateTicket(){
        return String.valueOf(entryTime)+vehicle.getVehicleNo()+parkingSpot.getId();
    }



}
