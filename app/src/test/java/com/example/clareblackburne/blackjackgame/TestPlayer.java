package com.example.clareblackburne.blackjackgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class TestPlayer {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Bob");
        card = new Card(Suit.CLUBS, Rank.TWO);
    }

    @Test
    public void canTakeCard(){
        player.takeCard(card);
        assertEquals(1, player.getHand().size());
    }

    @Test
    public void canGetHandValue(){
        player.takeCard(card);
        assertEquals(2, player.getHandValue());
    }
}
