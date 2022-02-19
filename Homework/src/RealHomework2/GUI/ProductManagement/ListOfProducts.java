package RealHomework2.GUI.ProductManagement;

import java.util.ArrayList;
import java.util.Collections;

public class ListOfProducts {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public String[] toArray() {
        String[] array = new String[products.size()];
        for (int i = 0; i < products.size(); i++) {
            array[i] = products.get(i).toString();
        }
        return array;
    }

    public double averagePrice() {
        double average = 0;
        for (Product p : products) {
            average += p.getPrice();
        }
        average /= products.size();
        return average;
    }

    public void sortByPrice() {
        Collections.sort(products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < products.size(); i++) {
            sb.append(products.get(i).toString());
            if (i != products.size() - 1)
                sb.append(", ");
            else
                sb.append("]");
        }
        return sb.toString();
    }
}
