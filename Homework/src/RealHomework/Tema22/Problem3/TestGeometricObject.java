package RealHomework.Tema22.Problem3;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject[] arr = new GeometricObject[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Square(i+1);

            System.out.printf("Square %d: \n", i+1);
            System.out.printf("area: %.2f \n", arr[i].getArea());
            arr[i].howToColor();
            System.out.println();
        }
    }
}
