package LiskovePrinciple;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        genuine case here no issue found because everything accordingly set
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Yamaha());
        vehicleList.add(new Bicycle());
        vehicleList.add(new Honda());

        for(Vehicle vehicle:vehicleList){
            System.out.println(vehicle.getNumOfVehicle(2));
        }

////        case 2:
//        List<BIke> bike = new ArrayList<>();
//        bike.add(new Yamaha());
//        bike.add(new Honda());
//        bike.add(new Bicycle());


    }

//    case 2 you see it like we did not add Bicycle because iots from Vehicle class not bike class so we did not add it so we
//     fix class in this manner every subclass have same behaviour of parent.
}
