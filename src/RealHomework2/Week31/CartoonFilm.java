package RealHomework2.Week31;

public class CartoonFilm extends Film {
    private String characterName;

    public CartoonFilm(int id, String name, int year, double price, String characterName) {
        super(id, name, year, price);
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    @Override
    public String toString() {
        return super.toString() + ", main character - " + characterName;
    }

    @Override
    public String toFileString() {
        return "2\n" + getName() + '\n' + getYear() + " " + String.format("%.2f", getPrice()) + " " + characterName + '\n';
    }
}
