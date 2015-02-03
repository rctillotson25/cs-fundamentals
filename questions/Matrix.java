package questions;

import java.util.Stack;
/*
 *  This class implements an NxN Matrix. However, the Matrix(int[][] matrix) method
 *  could be improved by checking that it is NxN.
 *
 *  This is just to be used with a sample interview question.
 *
 *  Authored on 2/1/2015 by rctillotson25
 *
 */
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

	// O(N) - where N = n^2 (N = number of elements, nxn = size of matrix)
	// CCW is exactly the same. 
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
		int[][] pivot = new int[n][n];
		
		// rotate cw means item in (i, j) gets moved to (j, n - 1 - i)
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				pivot[n-1-col][row] = matrix[row][col];
			}
		}		
		
		matrix = pivot;	
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
