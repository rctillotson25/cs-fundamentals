/*
 * A SetofStacks will, in most instances, 
 * act exactly like a standard stack. When a 
 * stack reaches capacity, it will make a new stack and 
 * push to that one. 
 *
 * What is the best way to implement this, though?
 *
 */ 

package setofstacks;

import java.util.Stack;
import java.util.ArrayList;

public class SetOfStacks {

	private ArrayList<Stack<String>> stacks;
	private int capacity;

	public SetOfStacks(int capacity) {
		this.capacity = capacity;
		this.stacks = new ArrayList<Stack<String>>();
	}		

	public void push(String s) {
		Stack<String> current;
		if (stacks.size() == 0) {
			current = new Stack<String>();
			stacks.add(current);
		} else {
			current = stacks.get(stacks.size() - 1);
		}

		if (current.size() >= capacity) {
			current = new Stack<String>();
			stacks.add(current);
		}

		current.push(s);
	}


	public void print() {
		for (int i = 0; i < stacks.size(); i++) {
			System.out.println("Stack " + i);
			for(int j = stacks.get(i).size() - 1; j >= 0; j--) {
				System.out.println(stacks.get(i).get(j));
			}
		}
	}
}
