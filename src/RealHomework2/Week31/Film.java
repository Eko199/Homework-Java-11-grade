package RealHomework2.Week31;

public class Film {
    private int id;
    private String name;
    private int year;
    private double price;

    public Film(int id, String name, int year, double price) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + ": " + name + " from " + year + " year for " + String.format("%.2f", price) + " euro";
    }

    public String toFileString() {
        return "1\n" + name + '\n' + year + " " + String.format("%.2f", price) + '\n';
    }
}
