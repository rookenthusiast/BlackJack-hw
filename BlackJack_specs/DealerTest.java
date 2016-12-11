import static org.junit.Assert.*;
import org.junit.*;
import BlackJack.*;


public class DealerTest{
  Dealer dealer;
  Player player;
  Hand hand;
  Deck deck;
  Card card;

  @Before 
  public void before() {
  dealer = new Dealer("Sticky_Fingers", deck, hand);
  player = new Player("Cameron", hand);
  }

@Test
public void canDealCard(){
  Card card = new Card(SuitType.HEART, ValueType.FIVE);
  dealer.dealCard(player);
  dealer.dealCard(player);
  assertEquals(2, player.hand.handCount());
}

}