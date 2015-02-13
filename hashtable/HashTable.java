package hashtable;


public class HashTable {

	private int maxSize;
	private int size;
	private HashEntry[] table;
	private HashEntry nil;

	public HashTable(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		this.table = new HashEntry[maxSize + 1];
		this.table[0] = null;
	}


	/*
	 * How to choose a hash function? 
	 * - Using Knuth Variant on Division 
	 * - k = key, m =maxSize h(k) = k(k+3) mod m  
	 */ 

	public int getHash(int k) {
		return ((k*(k+3)) % (maxSize + 1));
	}

	public void put(int k, String value) {
		
		// Would probably be wise to make an HashTableSizeException or something, but this is just practice.
		if(size > maxSize) {
			return;	
		} else {
			int hk = getHash(k);
		
			if (table[hk] == null) {
				table[hk] = new HashEntry(k, value);
				size++;
		 	} else {
				hk = linearProbing(hk);

				// add an exception for not found item
				if(hk == -1) {
					System.exit(1);
				} else {
					table[hk] = new HashEntry(k, value);
					size++;
				}
			}
		}
	}	

	public String get(int k) {
		int hk = getHash(k);

		if (table[hk].getKey() == k) {
			return table[hk].getValue();
		} else {
			int cursor = hk + 1;
			while (cursor != hk) {
				if(cursor > maxSize) {
					cursor = 1;
					continue;
				}
				if (table[cursor] != null) {
					if (table[cursor].getKey() == k) {
						return table[cursor].getValue();
					}
				// entry should not be null - key would have been put here.
				} else {
					return null;
				}
				cursor++;
			}		
		}
		return null;
	}

	// basic linear probing implentation
	private int linearProbing(int hk) {
		int cursor = hk + 1;		
		while (cursor != hk) {
			if (cursor > maxSize) {
				cursor = 1;
				continue;
			} else if (table[cursor] == null) {
				return cursor;
			}
			cursor++;
		}
		return -1;
	}

	private class HashEntry {
			
		private int key;
		private String value;


		protected HashEntry(int key, String value) {
			this.key = key;
			this.value = value;
		}

		protected int getKey() {
			return key;
		}

		protected String getValue() {
			return value;
		}

		protected void setValue(String value) {
			this.value = value;
		}
	}
}
