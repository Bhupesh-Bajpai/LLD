package ParkingRazorpay.Entity;

public class Car {
    String carType;
    long entryTime;
    long exitTime;

    public Car(String carType, long entryTime) {
        this.carType = carType;
        this.entryTime = entryTime;
    }

    public String getCarType() {
        return carType;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public long getExitTime() {
        return exitTime;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setEntryTime(long entryTime) {
        this.entryTime = entryTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }
}
