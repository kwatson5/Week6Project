package WARCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<>();
	
	private static String[] names = {"Clubs", "Diamonds", "Hearts", "Spades"};
	
	private static String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", 
			"Jack", "Queen", "King", "Ace"}; 
	
	
	public Deck() {	
		  for(String name : names) {	
			for (int valueIndex = 0; valueIndex < values.length; valueIndex++) {
				String value = values[valueIndex];
				String cardName = value + " of " + name;
				int rank = valueIndex + 2; 
				
				cards.add(new Card(cardName, rank));
			}
		}
	}	  

public void shuffle() {
	Collections.shuffle(cards);
}
	
public Card draw() {
	return cards.remove(0);
}
	
}
