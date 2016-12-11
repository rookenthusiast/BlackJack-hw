package BlackJack;

public class Dealer extends Player{

  public String name;
  Deck deck;
  Hand hand;

  public Dealer (String name, Deck deck, Hand hand){
   super(name, hand);
   this.deck = deck;


 }

 public String getName(){
  return this.name;
}

public void dealCard(Player player){
  Card card = deck.takeCard();
  player.takeCardFromDealer(card);
}

public void takeCardFromDealer(Card card){
  hand.addDealtCard(card);
}

}