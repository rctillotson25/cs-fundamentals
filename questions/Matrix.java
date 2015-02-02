package questions;

import java.util.Stack;

public class Matrix {
	private int[][] matrix;
	private int n;

	public Matrix(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	public Matrix(int[][] matrix) {
		this.n = matrix.length;
		this.matrix = matrix;
	}

	public int[][] getMatrix() { 
		return matrix;
	}

	// O(n) - each element is visited once. However, this requires O(n) AUXILARY space. 
	public void rotateCW() {
		int[][] pivot = new int[n][n];
		
		// rotate cw means item in (i, j) gets moved to (j, n - 1 - i)
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				pivot[col][n-1-row] = matrix[row][col];
			}
		}		
		
		matrix = pivot;	
	}

	public void rotateCCW() {
		System.out.println("Rotated Counter Clockwise.");
	}

	public void print() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
