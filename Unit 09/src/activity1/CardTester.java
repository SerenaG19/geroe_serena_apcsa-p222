package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		//See Mr. M's examples for how to test
		
		
		System.out.println("**** ace of clubs #1 Test ****");
		Card aceClubs = new Card("ace", "clubs", 1);
		System.out.println(aceClubs);
		
		System.out.println();
		
		System.out.println("**** 3 of diamonds #1 Test ****");
		Card threeDiamonds = new Card("3", "diamonds", 3);
		System.out.println(threeDiamonds);
		
		System.out.println();
		
		System.out.println("**** 6 of hearts #1 Test ****");
		Card sixHearts = new Card("6", "hearts", 6);
		System.out.println(sixHearts);
		

		
	}
}
