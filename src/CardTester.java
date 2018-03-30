/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card queenHearts = new Card("Queen", "Hearts", 12);
		Card kingSpades = new Card("King", "Spades", 13);
		Card twoDiamonds = new Card("Two", "Diamonds", 2);

		System.out.println(queenHearts.suit());
		System.out.println(queenHearts.rank());
		System.out.println(queenHearts.pointValue());
		System.out.println(queenHearts.matches(kingSpades));
		System.out.println(queenHearts.toString());

		System.out.println(kingSpades.suit());
		System.out.println(kingSpades.rank());
		System.out.println(kingSpades.pointValue());
		System.out.println(kingSpades.matches(queenHearts));
		System.out.println(kingSpades.toString());

		System.out.println(twoDiamonds.suit());
		System.out.println(twoDiamonds.rank());
		System.out.println(twoDiamonds.pointValue());
		System.out.println(twoDiamonds.matches(queenHearts));
		System.out.println(twoDiamonds.toString());
	}
}
