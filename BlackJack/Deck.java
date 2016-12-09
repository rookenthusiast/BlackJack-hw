package BlackJack;
import java.util.*;

public class Deck { 

  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }

  public int deckCount() {
    int count =0;
    for (Card card : deck){
      if (card != null) {
        count++;
      }
    }
    return count;
  }

  public void addCards(){
    for (SuitType suit : SuitType.values()) {
      for (ValueType number : ValueType.values()) {
        deck.add(new Card(suit, number));
      }
    }

  }

  public void shuffle( ){
    Collections.shuffle(deck);
  }

  public Card takeCard(){
return deck.remove(0);
  }

}