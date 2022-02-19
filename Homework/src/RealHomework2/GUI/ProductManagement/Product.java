package RealHomework2.GUI.ProductManagement;

public class Product implements Comparable<Product> {
    private final int ID;
    private String description = "";
    private double price = 0;

    public Product() {
        ID = 0;
    }

    public Product(int ID) {
        this.ID = ID;
    }

    public Product(int ID, String description, double price) {
        this.ID = ID;
        this.description = description;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " + ID + ": " +
                "description='" + description + '\'' +
                ", price=" + price;
    }

    @Override
    public int compareTo(Product p) {
        if (price > p.getPrice()) {
            return 1 + (int) (price - getPrice());
        } else if (price < p.getPrice()) {
            return -1 + (int) (price - getPrice());
        } else {
            return 0;
        }
    }
}
