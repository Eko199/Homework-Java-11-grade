package random.Ma2;

public class Test {
    public static void main(String[] args) {
        Theater theater = new Theater(0);
        Movie m1 = new Action(12, 2, 10);
        Movie m3 = new Action(12, 2, 5);
        Movie m2 = new Kids(69, 420, true, 2, 12);
        m1.arScene = new Scene[2];
        m1.arScene[0] = new Scene(2.5);
        m1.arScene[1] = new Scene(7.5);
        theater.add(m1);
        theater.add(m2);
        System.out.println(theater.actionMovieWithMaxNbStars().getNbStars());
    }
}
