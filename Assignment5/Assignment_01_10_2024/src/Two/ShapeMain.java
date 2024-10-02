package Two;

public class ShapeMain {
	public static void main(String[] args) {
		Shape shape = new Shape();

		// Calculate and print area and perimeter of a square
		double side = 5.0;
		shape.printArea(side);
		shape.printPerimeter(side);

		// Calculate and print area and perimeter of a rectangle
		double length = 10.0;
		double breadth = 4.0;
		shape.printArea(length, breadth);
		shape.printPerimeter(length, breadth);
	}
}
