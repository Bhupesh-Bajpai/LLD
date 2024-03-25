package AbstractFactoryPattern;

public class LuxryVehicle implements VehicleFcatory{

    @Override
    public Vehicle createVehicle() {
        return new LuxryV1();
    }
}
