package BlackJack;
import java.util.*;

public class Hand {

  private ArrayList<Card> hand;

  public Hand(){
    this.hand = new ArrayList<Card>();
  }

  public ArrayList<Card> getHand(){
    return this.hand;
  }

  public void addDealtCard(Card card){
    hand.add(card);
  }

  public int handCount() {
    int count =0;
    for (Card card : hand){
      if (card != null) {
        count++;
      }
    }
    return count;
  }
}