
package hashtable;


public class Main {


	public static void main(String[] args) { 
		HashTable table = new HashTable(35);

		for(int i = 4; i < 100; i++)
			System.out.println("Key: " + i + " Hash: " + table.getHash(i));
	}
}
