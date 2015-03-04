
package deckofcards;


public enum Suit {
	DIAMONDS (0),
	HEARTS   (1),
	SPADES   (2),
	CLUBS    (3);

	private final int value;

	private Suit(int v) {
		value = v;
	}

	private int getValue() { 
		return value;
	}

	public static Suit getSuitByValue(int value) {
		for(Suit s : Suit.values()) {
			if (s.getValue() == value) {
				return s;
			}
		}
		return null;
	}
}
