package BlackJack;

public class Dealer{

  public String name;
  Deck deck;
  Hand hand;

  public Dealer (String name, Deck deck, Hand hand){
    this.name = name;
    this.deck = deck;
    this.hand = hand;

  }

  public String getName(){
    return this.name;
  }

  public void dealCard(Player player, Dealer dealer){
    Card card = deck.takeCard();
    player.takeCardFromDealer(card);
    dealer.takeCardFromDealer(card);
  }

  public void takeCardFromDealer(Card card){
    hand.addDealtCard(card);
  }

}