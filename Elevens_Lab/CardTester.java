
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
		Card uno = new Card("1", "Spades", 1);
		Card due = new Card("1", "Spades", 1);
		Card tre = new Card("10", "Clubs", 10);
		
	System.out.println("Is the first card equal to the second card? " + uno.matches(due));
	System.out.println("Is the first card equal to the third card? " + uno.matches(tre));
	System.out.println("What is the rank, suit, and point value of the first card? " + uno.toString());
	}
	
}