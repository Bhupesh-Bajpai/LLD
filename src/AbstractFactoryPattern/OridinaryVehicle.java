package AbstractFactoryPattern;

public class OridinaryVehicle implements VehicleFcatory{
    @Override
    public Vehicle createVehicle() {
        return new OridinaryV1();
    }
}
