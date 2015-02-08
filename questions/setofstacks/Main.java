package setofstacks;

/*
 * Class for running setofstacks problems. 
 * Would probably be worthwhile at some point
 * to thread all of these main classes into one program.
 *
 */ 


public class Main {

	private static final int CAPACITY = 3;

	public static void main(String[] args) {
		System.out.println("Welcome to the Set of Stacks example program!");
		SetOfStacks stacks = new SetOfStacks(CAPACITY);
		stacks.push("1");
		stacks.push("2");
		stacks.push("3");
		stacks.push("4");
		stacks.push("5");
		stacks.print();
	}

}
