package BlackJack;
import java.util.*;

public class Deck { 

  private Card[] deck;

  public Deck(){
    this.deck = new Card[52];
  }

  public Card[] getDeck(){
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
    int counter = 0;
    for (SuitType suit : SuitType.values()) {
      for (ValueType number : ValueType.values()) {
        deck[counter] = new Card(suit, number);
        counter++;
      }
    }

  }

  public void shuffle( ){
    List<Card> shuffled = Arrays.asList(deck);
    Collections.shuffle(shuffled);
  }

  public Card dealCards(){
return deck.remove(0)
  }

}