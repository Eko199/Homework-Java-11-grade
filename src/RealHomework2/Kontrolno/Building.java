package RealHomework2.Kontrolno;

public class Building implements CarbonFootprint{
    private double electricity;
    private double lpg;
    private double waste;
    private double water;
    public Building() {

    }
    public Building(double electricity, double lpg, double waste, double water) {
        this.electricity = electricity;
        this.lpg = lpg;
        this.waste = waste;
        this.water = water;
    }
    public Building(Building b) {
        this.electricity = b.electricity;
        this.lpg = b.lpg;
        this.waste = b.waste;
        this.water = b.water;
    }
    public String toString() {
        return "Building used electricity "+electricity+", lpg "+lpg+", waste "+waste+" and water "+water;
    }
    public double getElectricity() {
        return electricity;
    }
    public void setElectricity(double electricity) {
        this.electricity = electricity;
    }
    public double getLpg() {
        return lpg;
    }
    public void setLpg(double lpg) {
        this.lpg = lpg;
    }
    public double getWaste() {
        return waste;
    }
    public void setWaste(double waste) {
        this.waste = waste;
    }
    public double getWater() {
        return water;
    }
    public void setWater(double water) {
        this.water = water;
    }
    public double getCarbonFootprint() {
        return (electricity+lpg+waste*365+water*52)*0.4374;
    }
}
