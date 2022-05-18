package random.Ma2;

public class Action extends Movie {
    private int nbStars;

    public Action(double duration, int size, int nbStars) {
        super(duration, size);
        this.nbStars = nbStars;
    }

    public int getNbStars() {
        return nbStars;
    }
}
