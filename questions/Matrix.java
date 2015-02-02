package questions;

public class Matrix {
	private int[][] matrix;

	public Matrix(int i, int j) {
		matrix = new int[i][j];
	}

	public void print() {
		for (int i = 0; i < matrix[i].length; i++) {
			for (int j = 0; i < matrix[j].length; j++) {
				System.out.print(matrix[i][j] + " ")
			}
		}
	}
}
