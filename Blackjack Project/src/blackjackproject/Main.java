package blackjackproject;
/**
 * 
 * @author Denley Tran
 *
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("Hey! How about a game of Blackjack?");
		
		Blackjack BJGame = new Blackjack();
		
		BJDeck testDeck = new BJDeck();
		testDeck.addCard(new BJCard(BJSuit.CLUB, BJRank.ACE));
		testDeck.addCard(new BJCard(BJSuit.CLUB, BJRank.ACE));
		testDeck.addCard(new BJCard(BJSuit.CLUB, BJRank.ACE));
		testDeck.addCard(new BJCard(BJSuit.CLUB, BJRank.ACE));
		Hand testHand = new Hand();
		testHand.takeBJCardfromDeck(testDeck);
		testHand.takeBJCardfromDeck(testDeck);
		testHand.takeBJCardfromDeck(testDeck);
		testHand.takeBJCardfromDeck(testDeck);
		System.out.println("The value of this hand is: " + testHand.totalValue());
	}

}
