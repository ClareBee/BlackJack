package com.example.clareblackburne.blackjackgame;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public enum Rank {
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    public int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
