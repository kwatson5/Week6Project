package WARCardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void describe() { //player description and hand info
		System.out.println(toString());
	}
	
	public Card flip() {//flip top card
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public List<Card> getHand(){
		return hand;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		builder.append("Name: ").append(name);
		builder.append("Hand: ");
		
		for(Card card : hand) {
			builder.append("------").append(card);
		}
		
		return builder.toString();
		
	}
}
