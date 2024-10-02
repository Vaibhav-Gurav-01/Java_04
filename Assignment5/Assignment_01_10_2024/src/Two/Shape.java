/*2.    Create a class to print the area of a square and a rectangle.The class has two methods ‘printArea’ and ‘printPerimeter’ with the same name but different number of parameters. The method for printing area of
Rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square.*/

package Two;

public class Shape {
	// Method to print area of a square
	public void printArea(double side) {
		double area = side * side;
		System.out.println("Area of Square: " + area);
	}

	// Method to print area of a rectangle
	public void printArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}

	// Method to print perimeter of a square
	public void printPerimeter(double side) {
		double perimeter = 4 * side;
		System.out.println("Perimeter of Square: " + perimeter);
	}

	// Method to print perimeter of a rectangle
	public void printPerimeter(double length, double breadth) {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle: " + perimeter);
	}
}
