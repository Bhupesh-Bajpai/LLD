package LiskovePrinciple;

public class Vehicle {

    int wheel;
    public int getNumOfVehicle(int wheel){
        return wheel;
    }

//    public boolean hasEngine(){
//        return true;
//    }

//    if we make this methid here so we did not use this class in bicycle because it is engine less so we need to make
//    one seprate class for it so there is no break of this Liskove principle.
}
