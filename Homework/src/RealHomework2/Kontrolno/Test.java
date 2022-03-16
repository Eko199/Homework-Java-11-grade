package RealHomework2.Kontrolno;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> arr = new ArrayList<>();
        arr.add(new Building(12, 12, 12, 12));
        arr.add(new Car(Fuel.CNG, 9));
        arr.add(new Bicycle("Tony", "Marcedes"));
        for(CarbonFootprint element : arr){
            System.out.println(element.getCarbonFootprint());
        }
    }
}
