package myPackage;

import java.util.Scanner;

public class MatrixRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for the first matrix
		System.out.print("Enter rows and columns for Matrix 1: ");
		int rows1 = sc.nextInt();
		int cols1 = sc.nextInt();
		Matrix matrix1 = new Matrix(rows1, cols1);

		System.out.println("Enter elements for Matrix 1:");
		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < cols1; j++) {
				matrix1.setElement(i, j, sc.nextInt());
			}
		}

		// Input for the second matrix
		System.out.print("Enter rows and columns for Matrix 2: ");
		int rows2 = sc.nextInt();
		int cols2 = sc.nextInt();
		Matrix matrix2 = new Matrix(rows2, cols2);

		System.out.println("Enter elements for Matrix 2:");
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < cols2; j++) {
				matrix2.setElement(i, j, sc.nextInt());
			}
		}

		// Adding matrices
		Matrix result = matrix1.add(matrix2);

		// Displaying results
		if (result != null) {
			System.out.println("Resultant Matrix:");
			result.display();
		}

		sc.close(); // Close the scanner
	}
}
