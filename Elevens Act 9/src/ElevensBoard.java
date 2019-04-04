import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {	
	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 	
		System.out.println("Serena Geroe, Period 2, 4/2/19, test taken on computer 29\n\n");

	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
//		return containsPairSum11(selectedCards) || containsJQK(selectedCards);		
		
		return containsTrioSum11(selectedCards) || containsPairFace(selectedCards);		
//		return containsPairSum11(selectedCards) || containsPairFace(selectedCards);		

	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
//	public boolean anotherPlayIsPossible() {
//		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
//		List<Integer> indList = cardIndexes();
//		for(int i = 0; i < indList.size(); i++)
//		{
//			for(int n = i+1; n < indList.size(); n++)
//			{
//				if(containsPairSum11(indList)) return true;
//				else if (containsJQK(indList)) return true;
//			}
//		}
//		return false;
//	}
	
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		List<Integer> indList = cardIndexes();
		for(int i = 0; i < indList.size(); i++)
		{
			for(int n = i+1; n < indList.size(); n++)
			{
				if(containsTrioSum11(indList)) return true;
//				if(containsPairSum11(indList)) return true;
				else if (containsPairFace(indList)) return true;
			}
		}
		return false;
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
//	private boolean containsPairSum11(List<Integer> selectedCards) {
//		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */		
//		for(int i = 0; i < selectedCards.size(); i++)
//		{
//			int outer = selectedCards.get(i).intValue();
//			
//			for(int n = i+1; n < selectedCards.size(); n++)
//			{
//				int inner = selectedCards.get(n).intValue();
//				
//				if(cardAt(outer).pointValue() + cardAt(inner).pointValue() == 11) return true;
//			}
//		}
//		return false;
//	}
	
	private boolean containsTrioSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
//		if(selectedCards.size() <= 3) 
//		{
			for(int i = 0; i < selectedCards.size(); i++)
			{
				int outer = selectedCards.get(i).intValue();
			
				for(int n = i+1; n < selectedCards.size(); n++)
				{
					int inner = selectedCards.get(n).intValue();

					for(int k = n+1; n < selectedCards.size(); n++)
					{
						int innest = selectedCards.get(k).intValue();
					 
						if(cardAt(outer).pointValue() + cardAt(inner).pointValue() + cardAt(innest).pointValue() == 11)
							return true;
					}				
				}
			}
//		}
			return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
//	private boolean containsJQK(List<Integer> selectedCards) {
//		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
//		
//		boolean hasJ = false;
//		boolean hasQ = false;
//		boolean hasK = false;
//		
//		for(int i = 0; i < selectedCards.size(); i++)
//		{	
//			if( cardAt( selectedCards.get(i) ).rank().equals("jack") ) hasJ = true;
//			else if( cardAt( selectedCards.get(i) ).rank().equals("queen") ) hasQ = true;
//			else if( cardAt( selectedCards.get(i) ).rank().equals("king") ) hasK = true;
//		}
//		if(hasJ && hasQ && hasK) return true;
//		return false;
//	}
	
	private boolean containsPairFace(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
//		for(int i = 0; i < selectedCards.size()-1; i++)
//		{
//			int outer = selectedCards.get(i).intValue();
//			
//			for(int n = i+1; n < selectedCards.size()-1; n++)
//			{
//				int inner = selectedCards.get(n).intValue();
//					
//				if(cardAt(outer).suit().equals(cardAt(inner).suit()) && 
//						cardAt(outer).suit().equals("jack") || cardAt(outer).suit().equals("queen") || cardAt(outer).suit().equals("king"))
//					return true;
//			}
//		}
//		return false;
//		
		
		if(selectedCards.size() == 2)
		{
			int first = selectedCards.get(0).intValue();
			int second = selectedCards.get(1).intValue();
			if(cardAt(first).suit().equals(cardAt(second).suit()) && 
					cardAt(first).suit().equals("jack") || cardAt(first).suit().equals("queen") || cardAt(first).suit().equals("king"))
				return true;
		}
		return false;
		
	}
	
	
}
