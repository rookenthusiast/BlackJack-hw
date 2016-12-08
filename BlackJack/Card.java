package BlackJack;

public class Card {

  SuitType suit;
  ValueType number;

  public Card(SuitType suit, ValueType number){
  this.suit = suit;
  this.number = number;
}

public SuitType getSuit() {
  return this.suit;
}

public ValueType getNumber() {
  return this.number;
}
}