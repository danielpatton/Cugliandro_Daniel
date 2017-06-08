/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	String[] rank1 = {"Jack", "King", "10"};
	String[] suits1 = {"diamonds", "clubs", "hearts",};
	int[] pv1 = {7, 13, 10};
	
	String[] rank2 = {"3", "Queen"};
	String[] suits2 = {"diamonds", "clubs"};
	int[] pv2 = {3, 12, 11};
	
	String[] rank3 = {"Ace", "Two", "Three", "Four"};
	String[] suits3 = {"clubs", "diamonds", "spades", "hearts"};
	int[] pv3 = {1, 2, 3, 4};
	
	Deck one = new Deck(rank1, suits1, pv1);
	Deck two = new Deck(rank2, suits2, pv2);
	Deck three = new Deck(rank3, suits3, pv3);
	
	System.out.println(one);
	System.out.println(two);
	System.out.println(three);
	three.shuffle();
	System.out.println(three);
	}
}
