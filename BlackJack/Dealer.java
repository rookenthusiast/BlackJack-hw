package BlackJack;

public class Dealer extends Player{

  Deck deck;

  public Dealer (String name, Deck deck, Hand hand){
    super(name);
    this.hand = hand;
    this.deck = deck;

  }

  public String getName(){
    return this.name;
  }

  public void dealCard(Player player){
    Card card = deck.takeCard();
    player.takeCardFromDealer(card);
  }

}