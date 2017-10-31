package com.example.clareblackburne.blackjackgame;

import java.util.Scanner;

/**
 * Created by clareblackburne on 31/10/2017.
 */

public class Runner {

    public static void main(String[] args) {


        Player player = new Player("Bob");
        Deck deck = new Deck();
        Dealer dealer = new Dealer("Dealer", deck);
        Game game = new Game(deck, dealer, player);

        game.initialDeal();
        System.out.println("Player's first card is " + player.getHandValue() + " and dealer's first card is " + dealer.getHandValue() );
        game.initialDeal();
        System.out.println("Player's hand value is now... " + player.getHandValue());

        String answer ="";
        do {
        dealer.ask(player);
        Scanner scan = new Scanner(System.in);
            answer = scan.nextLine();
            if(answer.equals("s")){
                break;
            }
            game.twistPlayer();
            System.out.println("this is the player" + player.getHandValue());}
        while (answer.equals("t") && !game.isBust);



        if(game.isBust){
            System.out.println("The dealer has won");
            System.exit(0);
        }
        else  {
            System.out.println("The player has decided to stick with " + player.getHandValue() + " points. Now it's the dealer's turn");
        }


       do{
           game.twistDealer();
       }
       while(dealer.getHandValue() < 16 && !game.isBust);


       if(game.isBust){
           System.out.println(dealer.getHandValue());
           System.out.printf("Player wins, dealer is bust");
           System.exit(0);
       } else {
            game.checkWinner();

       }




        //if b, player wins

        //compare hands

        //winner

    }
}
