package lab9;

/**
 * <p>Title: The Hand class</p>
 *
 * <p>Description: This class represents a Hand of playing cards.  COMPLETE THIS</p>
 * 
 * @author your name(s) here
 */
public class Hand 
{
	
	// instance variables
	private Card[] cards;
	private int numCards;
	
	/**
	 * default Hand constructor --
	 * allocates an array that is capable of storing at most 10 Card references
	 * sets the number of cards to 0
	 */
	public Hand()
	{
		cards = new Card[10];
		numCards = 0;
	}
	
	/** 
	 * insertCard method -- 
	 * accepts a reference to the Card object to be stored in the next position in the 
	 * cards array - checks to make sure the array isn't full
	 * @param theCard a reference to the Card object to be stored in the array
	 */
	public void insertCard(Card theCard)
	{
		if (numCards < cards.length)
		{
			cards[numCards] = theCard;
			numCards++;
		}
	}
	
	/**
	 * getCards method --
	 * makes a copy of the cards array and returns the address of the copy; 
	 * the size of the array that is returned is based upon the number of 
	 * cards currently in the hand
	 * @return a reference to the copy of the cards array 
	 */
	// PUT getCards METHOD HERE
	
	public Card[] getCards() {
		Card[] copy;
		copy = new Card[numCards];
		for(int i = 0; i < numCards; ++i) {
			copy[i] = cards[i];
		}
		return copy;
	}

	/**
	 * replaceCard method -- 
	 * accepts a reference to a new Card object and the position in which 
	 * the reference should be stored; the position is expected to be in the
	 * range 0 to (number of cards -1); position is validated to ensure that 
	 * it is in this range
	 * @param pos the index where the card should be stored
	 * @param theCard the reference to the Card object to be stored in the array
	 */
	// PUT replaceCard METHOD HERE
	
	public void replaceCard(int pos, Card newCard) {
		if (pos >= 0 && pos < cards.length)
			cards[pos] = newCard;
	}
		
	
	/**
	 * searchCard method --
	 * accepts a reference to a Card to search for and determines whether 
	 * or not that card exists in the hand 
	 * @param theCard a reference to the Card to search for
	 * @return true if the card is found, false otherwise
	 */
	// PUT searchCard METHOD HERE
	
	public boolean searchCard(Card theCard) {
		for(int i = 0; i < numCards; ++i) {
			if(cards[i].equalCard(theCard))
				return true;
		}
		return false;

	}
	/** 
	 * findNumFaceCards method --
	 * counts the number of face cards (ie. value of 11, 12 or 13) in the hand and
	 * returns the count
	 * @return the number of face cards in the hand
	 */
	// PUT findNumFaceCards METHOD HERE
	public int findNumFaceCards() {
		int count = 0;
		for(int i = 0; i < numCards; ++i) {
			if(cards[i].isAFaceCard() == true)
				count ++;
		}
		return count;
	}
	
	/**
	 * findLowCard method --
	 * finds and returns the position of the lowest card
	 * @return the index of the lowest card
	 */
	// PUT findLowCard METHOD HERE
	public int findLowCard() {
		int lowestIndex = 0;
		for(int i = 1; i < numCards; ++i) {
			if(cards[i].getValue() < cards[lowestIndex].getValue())
				lowestIndex = i;
		}
		return lowestIndex;
		
	}
	
	/**
	 * replaceLowCard method --
	 * accepts a reference to a Card object and replaces the card 
	 * having the lowest value with the new card
	 * @param theCard a reference to the Card object that will replace the 
	 * lowest card
	 */
	// PUT replaceLowCard METHOD HERE
	public void replaceLowCard(Card theCard) {
		int lowestCard = findLowCard();
		cards[lowestCard] = theCard;
	}
	
	/**
	 * toString method --
	 * creates and returns a reference to a String with each of the card values 
	 * on a separate line
	 * @return a reference to a String containing the state of the hand
	 */
	// PUT toString METHOD HERE
	
	public String toString() {
		String str = "";
		for(int i = 0; i < numCards; ++i) {
			str += "Card " + (i + 1) + ": " + cards[i].toString() + "\n";
		}
		return str;
	}

}