package com.example.clareblackburne.blackjackgame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class TestDeck {

    Deck deck;
    Deck spyDeck;

    @Before
    public void before(){
        deck = new Deck();
        spyDeck = Mockito.spy(deck);
    }

    @Test
    public void canGenerateDeck(){
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public void canGetCard(){
        Mockito.when(spyDeck.removeCard()).thenReturn(new Card(Suit.CLUBS, Rank.TWO));
        Card card = spyDeck.removeCard();
        assertEquals(Suit.CLUBS, card.getSuit());
        assertEquals(Rank.TWO, card.getRank());
    }



}
