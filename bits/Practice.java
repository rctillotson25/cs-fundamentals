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

		// clearBit tests
		System.out.println("Clear 2,1 " + clearBit(2,1));
		System.out.println("Clear 3,1 " + clearBit(3,1));
		

		// setBit tests
		System.out.println("Set 0,8 " + setBit(0,8));
		System.out.println("Set 1,1 " + setBit(1,1));

		// updateBit tests
		System.out.println("Set 0,8,ON " + Integer.toBinaryString(updateBit(0,8,ON)));
		System.out.println("Set 1,0,OFF " + Integer.toBinaryString(updateBit(1,0,OFF)));
	}

	public static boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0);
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

}
