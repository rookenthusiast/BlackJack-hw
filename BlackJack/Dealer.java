package BlackJack;

public class Dealer{

  public String name;
  Deck deck;

  public Dealer (String name, Deck deck){
    this.name = name;
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