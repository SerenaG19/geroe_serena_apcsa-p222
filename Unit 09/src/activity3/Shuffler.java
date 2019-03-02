package activity3;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 9;

	/**
	 * The number of values to shuffle.
	 */
	private static final int VALUE_COUNT = 52;

	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		
		//initializes array of values to be used for perfectShuffle, each element represented by its index
		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) values1[i] = i;
		
		//Neatly prints results for perfect shuffle; completes perfectShuffle method SHUFFLE_COUNT times
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();
	
		//initializes array of values to be used for selectionShuffle, each element represented by its index
		int[] values2 = new int[VALUE_COUNT];
		for (int i = 0; i < values2.length; i++) values2[i] = i;

		//Neatly prints results for selection shuffle; completes selectionShuffle method SHUFFLE_COUNT times
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		//will return same order of deck every time
		
		//after values array is shuffled, elements are put in shuffled array
		int[] shuffled = new int[values.length];

			//actual perfect shuffle method here
			int k = 0;
			for(int j = 0; j < (values.length+1)/2; j++)//split the deck, put cards at an even index
			{
				shuffled[k] = values[j];
				k += 2;
			}
			k = 1;
			for(int j = (values.length+1)/2; j < values.length; j++)
			{
				shuffled[k] = values[j];
				k += 2;
			}
		
		//copy shuffled to values so that the final outcome is the shuffled deck, not the original one
		for(int x = 0; x < values.length; x++) values[x] = shuffled[x];
		
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	
	//selected cards are stored in shuffled; not-yet-selected cards are stored in values
	
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		
		//will NOT return same order of deck every time bc uses Math.random()
		
		//this array will hold the shuffled cards
		int[] shuffled = new int[values.length];
	
		int r;
		
		//selection shuffle
		for(int i = values.length-1; i > 0; i--)
		{
			r = (int) ( Math.random() *(i+1) ); // use random # times (i+1) to make calculation inclusive
			shuffled[i] = values[r];
			
			//prevent duplicates by actually removing values[r] from values
			values[r] = values[i];
		}
		
		//copy shuffled deck back to values deck
		for(int x = 0; x < values.length; x++) values[x] = shuffled[x];
	}
}
