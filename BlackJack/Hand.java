package BlackJack;

public class Hand {
 
private ArrayList<Card> hand;

public Hand(){
this.hand = new ArrayList<Card>();
}

public ArrayList<Card> getHand(){
  return this.hand;
}

}