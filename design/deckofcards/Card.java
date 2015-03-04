// Card implementation for OO design practice.
//
//
//
//

package deckofcards;

public abstract class Card {

	private boolean available;
	protected Suit suit;
	protected int faceValue;

	public Card(int v, Suit s) {
		suit = s;
		faceValue = v;
	}
	
	public int getValue() {
		return faceValue;
	}

	public void setAvailable(boolean a) {
		available = a;
	}

	public boolean getAvailable() {
		return available;
	}

}
