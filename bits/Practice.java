package bits;


public class Practice {


	public static int ON  = 1;
	public static int OFF = 0;

	public static void main(String[] args) {
		
		// getBit tests
		System.out.println("1,0 " + getBit(1,0));
		System.out.println("1,1 " + getBit(1,1));
		System.out.println("2,1 " + getBit(2,1));
		System.out.println("256,8 " + getBit(256,8));

		// getBitValue tests
		System.out.println("Value 1,0 " + getBitValue(1,0));
		System.out.println("Value 1,1 " + getBitValue(1,1));
		System.out.println("Value 2,1 " + getBitValue(2,1));
		System.out.println("Value 256,8 " + getBitValue(256,8));
		
		// clearBit tests
		System.out.println("Clear 2,1 " + clearBit(2, 1));
		System.out.println("Clear 3,1 " + clearBit(3, 1));
		

		// setBit tests
		System.out.println("Set 0,8 " + setBit(0, 8));
		System.out.println("Set 1,1 " + setBit(1, 1));

		// updateBit tests
		System.out.println("Set 0,8,ON " + Integer.toBinaryString(updateBit(0, 8, ON)));
		System.out.println("Set 1,0,OFF " + Integer.toBinaryString(updateBit(1, 0, OFF)));

		// insertMN tests
		System.out.println("insertMN 128,7,0,3 " + insertMN(128, 7, 0, 3) + " = 135");

		// getBitDifference tests
		System.out.println("Bit Diff: 31, 14 " + getBitDiff(31, 14) + " = 2");
		System.out.println("Bit Diff: 5, 1" + getBitDiff(5, 1) + " = 1");

		// move over 1 tests
		System.out.println("Move over: " + getOverOne(0));
	}

	public static int getOverOne(int i) {
		return i >> 1;
	}

	public static boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0);
	}

	public static int getBitValue(int num, int i) {
		return (num >> i) & 1; 
	}

	public static int clearBit(int num, int i) {
		int mask = ~(1 << i);
		return num & mask;
	}

	public static int setBit(int num, int i) {
		return num | (1 << i);
	}

	public static int updateBit(int num, int i, int v) {
		int mask = ~(1 << i);
		return (num & mask) | (v << i);	
	}	

	public static int insertMN(int n, int m, int i, int j)  {
		for (int k = 0; k < j-i; k++) {
			n = updateBit(n, k+i, getBitValue(m, k));
		}
		return n;
	}

	public static int getBitDiff(int a, int b) {
		int x = a ^ b;
		int count = 0;
		for (int i = 1; i <= x; i *= 2) {
			if ((x & i) != 0) {
				count++;	
			}
		}

		return count;
	}

}
