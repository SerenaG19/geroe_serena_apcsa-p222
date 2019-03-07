package elevensWithArrayList;
import java.util.List;
import java.util.ArrayList;

//import activity1.Card;

import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;
	

	private List<Card> cards;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		
		//MAKE SURE YOU UNDERSTAND THIS; fair game for assessments, and lots of assignments
		//be able to do this quickly
		
		//instantiate new array of cards
		//loop over ranks then suits (nested loop)
		//add new card object to the array
		//later on, call shuffle method in Act 4
		
//		ArrayList<Card>cards = new ArrayList<Card>();
		
		//cards = new ArrayList<Cards>();

		
		for(int i = 0; i < ranks.length * suits.length; i=i) //for each card
		{
			for(int j = 0; j < ranks.length; j++) 			 //for each rank
			{
				for (int k = 0; k < suits.length; k++)		 //for each suit within each rank
				{
					Card c = new Card(ranks[j], suits[k], values[j]);
					cards.add(c);
					size++;
					i++;
				}
			}
		}
		shuffle();
	}
	
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//check size to see if deck is empty
		return size == 0;	
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		
		//this should work for just arrays for now, will be asked later to make it work with array lists
		//use the efficient selectionShuffle
		ArrayList<Card> shuffled = new ArrayList<Card>();
		int r;
		
//	Attempt One --------------------------------------------------------------------------------------------------------------	
//		int i = size()-1;
//		do
//		{
//			r = (int) ( Math.random() * (i+1) );		//r is a random number greater than 0 and less than or equal to 1
//			shuffled.add(cards.get(r));					//add the card from cards at the random index r to the shuffled List
//			cards.remove(r);							//remove the card from cards List
//			i--;
//		} while(i >= 0 );
//	Attempt One --------------------------------------------------------------------------------------------------------------		
		
		int i = 0;

		do
		{
			r = (int) ( Math.random() * size() );		//r is a random number greater than 0 and less than or equal to i
			shuffled.add(cards.get(r));					//add the card from cards at the random index r to the shuffled List
//			cards.remove(r);							//remove the card from cards List
			i++;
		} while(i < size() );
		
		
		
		for(int q = 0; q < cards.size(); q++) cards.set(q,shuffled.get(q));
		
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		//check if deck is empty
		//decrement deck size (pull a card off top one at a time)
		//return card object from array
		if(isEmpty()) return null;
		size--;
		return cards.get(size);		
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
