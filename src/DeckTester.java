/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		// String[] ranks = {"ace", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "hearts"};
		// String[] suits = {"hearts", "diamonds", "spades", "clubs"};
		// int[] values = {};
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {2, 1, 6};
		Deck deck = new Deck(ranks, suits, values);
		System.out.println(deck.size());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.deal());
		System.out.println(deck.size());
		System.out.println(deck.deal());
	}
}
