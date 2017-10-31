package com.example.clareblackburne.blackjackgame;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class Game {

    Deck deck;
    Dealer dealer;
    Player player;
    boolean isWon;
    boolean isBust;
    int playerHandValue = 0;
    int dealerHandValue = 0;

    public Game(Deck deck, Dealer dealer, Player player){
        this.deck = deck;
        this.dealer = dealer;
        this.player = player;
        this.isWon = false;
        this.isBust = false;
    }

    public void initialDeal(){

        playerHandValue += (player.takeCard(dealer.deal()));
        dealerHandValue += (dealer.takeCard(dealer.deal()));

    }


    public void twistPlayer() {

        playerHandValue += (player.takeCard(dealer.deal()));
        checkPlayerHand();
    }

    public void twistDealer() {
        checkPlayerHand();
        dealerHandValue += (dealer.takeCard(dealer.deal()));

    }

    public void checkPlayerHand() {
        if (player.getHandValue() > 21) {
            this.isBust = true;
        } else {
            this.isBust = false;
        }
    }

        public void checkDealerHand(){
        if (dealer.getHandValue() > 21){
            this.isBust = true;
        } else {
            this.isBust = false;
        }
        }

        public void checkWinner(){
            if(player.getHandValue() > dealer.getHandValue())
            {
                System.out.println("Player wins with " + player.getHandValue() + " The dealer had " + dealer.getHandValue());
            }
            else {
                System.out.println("Dealer wins with " + dealer.getHandValue() + " The player had " + player.getHandValue());
            }
        }
}












