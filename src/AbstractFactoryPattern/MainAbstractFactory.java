package AbstractFactoryPattern;

public class MainAbstractFactory {
    public static void main(String[] args) {
        VehicleFcatory luxryFactory = new LuxryVehicle();
        Vehicle luxryVehicle = luxryFactory.createVehicle();
        luxryVehicle.average();

    }
}
