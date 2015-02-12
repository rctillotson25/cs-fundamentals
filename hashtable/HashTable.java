package hashtable;


public class HashTable {

	private int maxSize;
	private int size;
	private String[] table;

	public HashTable(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.table = new String[maxSize + 1];
		this.table[0] = null;
	}


	/*
	 * How to choose a hash function? 
	 * - Using Knuth Variant on Division 
	 * - k = key, m =maxSize h(k) = k(k+3) mod m  
	 */ 

	public int getHash(int k) {
		return ((k*(k+3)) % maxSize) + 1;
	}

	public int put(int k, String value) {
		return 0;		
	}	

}
