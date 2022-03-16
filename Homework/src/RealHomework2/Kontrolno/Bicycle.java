package RealHomework2.Kontrolno;

public class Bicycle implements CarbonFootprint{
    private String owner;
    private String brand;

    public Bicycle() {

    }
    public Bicycle(String owner, String brand) {
        this.owner = owner;
        this.brand = brand;
    }
    public Bicycle(Bicycle b) {
        this.owner = b.owner;
        this.brand = b.brand;
    }
    public String toString() {
        return owner+"'s bicycle from brand "+brand;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getCarbonFootprint() {
        return 0;
    }
}
