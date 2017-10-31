package com.example.clareblackburne.blackjackgame;

import java.util.ArrayList;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class Player {

    private String name;
    private ArrayList<Card> hand;
    int handValue;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int takeCard(Card card){
        hand.add(card);
        return getHandValue();

    }

    public int getHandValue(){
        handValue = 0;
        for(Card item : this.getHand()){
            handValue += item.getValue();
        }
        return handValue;
    }



}
