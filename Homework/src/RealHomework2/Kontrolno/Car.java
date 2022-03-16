package RealHomework2.Kontrolno;

enum Fuel {
    CNG, Diesel, LPG, Motor_Gasoline
}

public class Car implements CarbonFootprint {
    private Fuel fuelType;
    private double distance;
    public Car() {

    }
    public Car(Fuel fuelType, double distance) {
        this.fuelType = fuelType;
        this.distance = distance;
    }
    public Car(Car c) {
        this.fuelType = c.fuelType;
        this.distance = c.distance;
    }
    public String toString() {
        return "Car uses "+fuelType+" and has driven "+distance+"km";
    }

    public Fuel getFuelType() {
        return fuelType;
    }
    public void setFuelType(Fuel fuelType) {
        this.fuelType = fuelType;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double getCarbonFootprint() {
        if (fuelType==Fuel.CNG){
            return distance*0.05444;
        } else if (fuelType==Fuel.Diesel){
            return distance*10.21;
        } else if (fuelType==Fuel.LPG){
            return distance*5.68;
        } else if (fuelType==Fuel.Motor_Gasoline){
            return distance*8.78;
        }
        return 0;
    }
}
