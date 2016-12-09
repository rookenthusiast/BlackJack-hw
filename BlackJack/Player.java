package BlackJack;

public class Player {

  public String name;
  Hand hand;

  public Player(String name, Hand hand){
    this.name = name;
    this.hand = hand;
  }

  public String getName(){
    return this.name;
  }

  public Hand getHand(){
    return this.hand;
  }
  
}