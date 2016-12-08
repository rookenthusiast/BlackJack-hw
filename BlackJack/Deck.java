package BlackJack;

public class Deck { 

  private Card[] deck;

  public Deck(){
    this.deck = new Card[52];
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
      System.out.println("SUIT CHANGE " + suit);
      for (ValueType number : ValueType.values()) {
        System.out.println("NUMBER CHANGE " + number);
        deck[counter] = new Card(suit, number);
        counter++;
      }
    }

  }

  public void shuffle(){
    
  }

  public void dealCards(){

  }

}