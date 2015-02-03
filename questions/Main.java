package questions;


public class Main {

	public static int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

	public static void main(String[] args) {
		Matrix m = new Matrix(matrix);
		m.print();		
		
		System.out.println("Rotating Clockwise.");
		m.rotateCW();
		m.print();

		System.out.println("Rotating Counterclockwise.");
		m.rotateCCW();
		m.print();

		System.out.println("Rotating Counterclockwise... again");
		m.rotateCCW();
		m.print();
	}
}
