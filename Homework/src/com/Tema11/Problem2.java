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

    public String getValue() {
        switch (number) {
            case 11:
                return "Ace";
            case 12:
                return "Jack";
            case 13:
                return "Queen";
            case 14:
                return "King";
            default:
               return "" + number;
        }
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
            System.out.println("Drawn card " + (i + 1) + ": " + deck[index].getValue() + " of " + deck[index].getSuit());
        }
    }
}
