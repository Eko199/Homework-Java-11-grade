package com.Tema11;

enum Suit {
    SPADES, DIAMONDS, HEARTS, CLUBS;
}

class Card {
    private int number;
    private Suit suit;

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}

public class Problem2 {
    static boolean isInArray(int index, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == index) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Card[] deck = new Card[52];
        int x = 0;
        for (int i = 2; i < 15; i++) {
            for (int j = 0; j < 4; j++) {
                deck[x] = new Card(i, Suit.values()[j]);
                x++;
            }
        }

        int[] drawnIndexes = new int[4];
        for (int i = 0; i < 4; i++) {
            int index = (int) (Math.random() * 52);
            while (isInArray(index, drawnIndexes)) index = (int) (Math.random() * 52);
            drawnIndexes[i] = index;
            String number;
            switch (deck[index].getNumber()) {
                case 11:
                    number = "Ace";
                    break;
                case 12:
                    number = "Jack";
                    break;
                case 13:
                    number = "Queen";
                    break;
                case 14:
                    number = "King";
                    break;
                default:
                    number = "" + deck[index].getNumber();
            }
            System.out.println("Drawn card " + (i + 1) + ": " + number + " of " + deck[index].getSuit());
        }
    }
}
