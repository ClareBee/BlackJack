package com.example.clareblackburne.blackjackgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class TestCard {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.EIGHT);
    }

    @Test
    public void cardHasValue(){
        assertEquals(8, card.getValue());
    }


}
