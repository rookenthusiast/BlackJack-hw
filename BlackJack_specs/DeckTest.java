import static org.junit.Assert.*;
import org.junit.*;
import BlackJack.*;

public class DeckTest{

 Deck deck;
 Card card;

 @Before 
 public void before() {
  deck = new Deck();
}

@Test
public void canAddCards(){
  deck.addCards();
  assertEquals(52, deck.deckCount());
}

@Test
public void deckIsShuffled(){
  deck.shuffle();
System.out.println(deck);
}
}