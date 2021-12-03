package random.Ma2;

import java.util.ArrayList;

public class Theater {
    private int id;
    private int nbSeats;
    private ArrayList<Movie> arMovie = new ArrayList<Movie>(6);

    public Theater(int id) {
        this.id = id;
    }

    public void add(Movie m) {
        arMovie.add(m);
    }

    public Action actionMovieWithMaxNbStars() {
        int max = -1, maxId = -1;
        for (int i = 0; i < arMovie.size(); i++) {
            if (arMovie.get(i) instanceof Action) {
                Action currMovie = (Action) arMovie.get(i);
                if (max == -1 || currMovie.getNbStars() > max) {
                    max = currMovie.getNbStars();
                    maxId = i;
                }
            }
        }

        if (maxId != -1) {
            return (Action) arMovie.get(maxId);
        } else {
            System.out.println("There are no Action Movies.");
            return null;
        }
    }

    public void most2ActionMovies(Action best, Action secondBest) {}

    public int loadKidsMovieFromFile(String filename) {
        return 1;
    }
}
