import static org.junit.Assert.*;
import org.junit.*;
import BlackJack.*;

public class PlayerTest{
  Player player;
  Dealer dealer;
  Hand hand;
  Deck deck;
  Card card;

@Before 
public void before() {
player = new Player("Cameron", hand);
}

@Test
public void canGetHand(){
  Card card = new Card(SuitType.HEART, ValueType.FIVE);
  dealer.dealCard(player, dealer);
  player.takeCardFromDealer(card);
  player.takeCardFromDealer(card);
  assertEquals(2, hand.handCount());
}
}