import static org.junit.Assert.*;
import org.junit.*;
import BlackJack.*;

public class CardTest{
  Card card;

@Before 
public void before() {
  card = new Card(SuitType.HEART, ValueType.FIVE);
}

@Test
public void canGetSuit() {
  assertEquals(SuitType.HEART, card.getSuit());
}

@Test
public void canGetNumber() {
  assertEquals(ValueType.FIVE, card.getNumber());
}
}