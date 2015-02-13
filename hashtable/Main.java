
package hashtable;


public class Main {


	private static final int MAX_SIZE = 100;
	public static void main(String[] args) { 
		HashTable table = new HashTable(MAX_SIZE);

		for(int i = MAX_SIZE; i >= 0; i--) {
			table.put(i, " " + i);
		}
		for(int i = MAX_SIZE; i >= 0; i--) {
			System.out.println("i = " + i + " get: " + table.get(i));
		}
	}
}
