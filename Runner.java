import BlackJack.*;
import java.util.*;

public class Runner{

  public static void main(String[] args) {

    Deck deck = new Deck();
deck.addCards();   
deck.shuffle();
for (Card card : deck.getDeck()){
  System.out.println(card.toString());
}

  }
}