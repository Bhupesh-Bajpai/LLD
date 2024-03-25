package ParkingLot.Entity;

public class EntranceGate {

ParkingSpotFactory parkingSpotFactory;
ParkingSpotManager parkingSpotManager;


Ticket ticket;


public void findSpace(Vehicle vehicle){

   parkingSpotManager = parkingSpotFactory.getParkingSpotManager(vehicle);
   parkingSpotManager.findParkingSpace();
}
public void bookSpace(Vehicle vehicle){
    parkingSpotManager = parkingSpotFactory.getParkingSpotManager(vehicle);
    parkingSpotManager.parkVehicle(vehicle);

}

public void genrateTicket(){
   ticket.genrateTicket();
}

}
