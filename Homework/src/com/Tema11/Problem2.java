package com.Tema11;

enum Suit {
    SPADES, DIAMONDS, HEARTS, CLUBS
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
            
        }
    }
}
