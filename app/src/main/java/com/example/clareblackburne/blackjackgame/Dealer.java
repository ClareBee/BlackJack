package com.example.clareblackburne.blackjackgame;

import java.util.ArrayList;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class Dealer {

    String name;
    Deck deck;
    ArrayList<Card> hand;
    int handValue;

    public Dealer(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
        this.hand = new ArrayList<>();
    }


    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setDealerHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public Card deal(){
        return this.deck.removeCard();
    }

    public int takeCard(Card card){
        this.hand.add(card);
        return getHandValue();
    }

    public String getName() {
        return this.name;
    }

    public int getHandValue(){
        handValue = 0;
        for(Card item : this.getHand()){
            handValue += item.getValue();
        }
        return handValue;
    }

    public void ask(Player player){
        System.out.println("Press s for stick or t for twist");
    }

    public void play(){

    }


}