/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] ranks1 = {"A", "B", "C"};
		String[] suits1 = {"Giraffes", "Lions"};
		int[] values1 = {2, 1, 6};

		String[] ranks2 = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
		String[] suits2 = {"hearts", "diamonds", "spades", "clubs"};
		int[] values2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		Deck deck1 = new Deck(ranks1, suits1, values1);
		Deck deck2 = new Deck(ranks2, suits2, values2);
		System.out.println(deck2.size());
		System.out.println(deck2.deal());
	
	}
}
