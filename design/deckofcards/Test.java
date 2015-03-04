package deckofcards;


public class Test {

	public static void main(String[] args) {
		Suit s = Suit.getSuitByValue(0);
		CardWrapper card = new CardWrapper(1, s);
		System.out.println(card.getValue());
	}
}
