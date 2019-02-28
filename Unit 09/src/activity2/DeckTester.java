package activity2;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args)
	{
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] ranks = {"three","five","jack"};
		String[] suits = {"diamonds","hearts","clubs"};
		int[] values = {3,5,11};
		
		Deck test = new Deck(ranks,suits,values);
		
		while(test.isEmpty() == false)
		{
			System.out.println( test.size() );
			System.out.println( test.isEmpty() );
			System.out.println();
			System.out.println( test.deal() );
		}
		
	}
}
