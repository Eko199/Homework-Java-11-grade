package random.Ma2;

public class Movie {
    private double duration;
    protected Scene[] arScene;

    public Movie(double duration, int size) {
        this.duration = duration;
        arScene = new Scene[size];
    }

    public void display() {
        for (int i = 0; i < arScene.length; i++) {
            arScene[i].display();
        }
    }
}
