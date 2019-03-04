package activity4;
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
		String[] ranks = {"ace","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
		String[] suits = {"spades","hearts","diamonds","clubs"};
		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
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
