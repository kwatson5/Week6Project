package WARCardGame;

public class App {

	public static void main(String[] args) {
		
		//instantiate deck
		Deck deck = new Deck();
		
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
		
		//call the shuffle method
		deck.shuffle();
		
		//deal
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
		
		//play
		for(int i = 0; i < 26; i++) {
		
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
		
		if(player1Card.getValue() > player2Card.getValue()) {
			player1.incrementScore();
		}
		else if(player2Card.getValue() > player1Card.getValue()) {
			player2.incrementScore();
		}
		}	
		
		//print final score
		if(player1.getScore() > player2.getScore()) {
			System.out.println("Winner: " +player1.getName() +" Score: " +player1.getScore() );
			System.out.println("Loser: " +player2.getName() +" Score: " +player2.getScore());
		}
		else if(player2.getScore() > player1.getScore()) {
			System.out.println("Winner: " +player2.getName() +" Score: " +player2.getScore() );
			System.out.println("Loser: " +player1.getName() +" Score: " +player1.getScore());
		}
		else {
			System.out.println("Draw: " + player1.getScore());
		}
		
	}
}
