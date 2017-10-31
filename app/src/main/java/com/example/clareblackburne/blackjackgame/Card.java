package com.example.clareblackburne.blackjackgame;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class Card {

    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return this.suit;
    }


    public Rank getRank() {
        return this.rank;
    }

    public int getValue(){
        return this.rank.getValue();
    }


}
