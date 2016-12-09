import static org.junit.Assert.*;
import org.junit.*;
import BlackJack.*;

public class HandTest{
  Hand hand;
  Deck deck;
 

  @Before
  public void before(){
   hand = new Hand();
 }

 @Test
 public void canGetHand(){
  Card card = new Card(SuitType.HEART, ValueType.FIVE);
  hand.addDealtCard(card);
  hand.addDealtCard(card);
  assertEquals(2, hand.handCount());
}

}
