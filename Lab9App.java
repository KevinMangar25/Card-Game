package lab9;

/**
 * <p>
 * Title: The Lab9App class
 * </p>
 *
 * <p>
 * Description: COMPLETE THIS
 * </p>
 * 
 * @author your name(s) here
 */
public class Lab9App {

	public static void main(String[] args) {
		
		// create and shuffle the deck
		Deck theDeck = new Deck();
		theDeck.shuffleDeck();

		// instantiate a Hand object
		Hand myHand = new Hand();

		// insert 7 cards in the hand
		Card theCard;
		for (int i = 0; i < 7; i++) {
			theCard = theDeck.dealCard();
			myHand.insertCard(theCard);
		}
		//calling the toString method
		System.out.println("Display the cards in the hand: ");
		System.out.println(myHand);
		
		//Calling the getCards method
		Card[] theCards = myHand.getCards();
		System.out.println("Get a copy of the cards array, and display the contents of the copy: ");
		for(int i = 0; i < theCards.length; ++i) {
			System.out.println(theCards[i].toString());
		}
		Card newCard = new Card(30);
		theCards[0] = newCard;
		System.out.println("\nChanging the first card in the copy to the 4 of hearts: ");
		for(int i = 0; i < theCards.length; ++i) {
			System.out.println(theCards[i].toString());
		}
		
		//Displaying the card in hand
		System.out.println("\nDisplay the cards in the hand: ");
		System.out.println(myHand);
		
		//Calling the replaceCard method
		Card deckCard;
		deckCard = theDeck.dealCard();
		System.out.println("Replacing the card in position 0 with a deck card and display the cards in the hand: ");
		myHand.replaceCard(0, deckCard);
		System.out.println(myHand);
		
		//calling the searchCard method
		Card newCard2 = new Card(40);
		if(myHand.searchCard(newCard2) == true)
			System.out.println("The hand has the Ace of Spades.");
		else
			System.out.println("The hand does not have the Ace of Spades.");
		
		//calling the findNumFaceCards method
		System.out.println();
		System.out.println("There are " + myHand.findNumFaceCards() + " face card(s) in the hand.");
		
		//calling the replaceLowCard method
		Card newDeckCard = theDeck.dealCard();
		System.out.println("\nReplacing the lowest card with a deck card and display the cards in the hand:");
		myHand.replaceLowCard(newDeckCard);
		System.out.println(myHand);
	}

}