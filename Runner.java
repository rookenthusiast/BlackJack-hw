import BlackJack.*;
import java.util.*;

public class Runner{

  public static void main(String[] args) {

    Deck deck = new Deck();
    Hand hand = new Hand();
    Dealer dealer = new Dealer("Sticky_Fingers", deck);
    Player player = new Player("Cameron", hand);
    deck.addCards();   
    deck.shuffle();
    // for (Card card : deck.getDeck()){
    //   System.out.println(card.toString());
    // }
    dealer.dealCard(player);
    dealer.dealCard(player);
    for (Card card : hand.getHand()){
      System.out.println(card.toString());
    }
  }


}