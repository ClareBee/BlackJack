package com.example.clareblackburne.blackjackgame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class TestDealer {

    Dealer dealer;
    Deck deck;
    Card card;

    @Before
    public void before(){
        dealer = new Dealer("Dealer", deck);
        card = new Card(Suit.SPADES, Rank.NINE);
    }

    @Test
    public void hasName(){
        assertEquals("Dealer", dealer.getName());
    }

    @Test
    public void takeCard(){
        dealer.takeCard(card);
        assertEquals(1, dealer.getHand().size());
    }
    @Test
    public void canDeal(){

    }



}
