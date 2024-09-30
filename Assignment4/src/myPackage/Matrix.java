/*4.    Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information 
a.    number of rows of matrix
b.    number of columns of matrix
c.    elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
a.    get the number of rows
b.    get the number of columns
c.    set the elements of the matrix at given position (i,j)
d.    adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.*/

package myPackage;
import  java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private int[][] elements;

    // Constructor to initialize the matrix
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        elements = new int[rows][cols];
    }

    // Set an element at position (i, j)
    public void setElement(int i, int j, int value) {
        elements[i][j] = value;
    }

    // Add another matrix
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrices cannot be added.");
            return null;
        }
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.setElement(i, j, this.elements[i][j] + other.elements[i][j]);
            }
        }
        return result;
    }

    // Display the matrix
    public void display() {
        for (int[] row : elements) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
