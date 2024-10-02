package Two;

abstract public class GeometricShape {

	abstract void area();
	abstract void perimeter();
}

//--------------------------------------------------------------------------

class Circle extends GeometricShape {

	private double radius;
	private final double PI = 3.14;

	void area() {
		double area1 = PI * radius * radius;
		System.out.println("Area of circle: "+area1);
	}

	void perimeter() {
		double peri = 2 * PI * radius;
		System.out.println("Perimeter of circle: "+peri);
	}

	//constructor
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

}

//--------------------------------------------------------------------------
class Rectangle extends GeometricShape {

	private double l, b;

	void area() {
		double area1 = l * b;
		System.out.println("area of Rectangle: " +area1);
	}

	void perimeter() {
		double peri = 2 * (l + b);
		System.out.println("Perimeter of Rectangle: "+peri);
	}

	//constructor
	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

}

//--------------------------------------------------------------------------
class Triangle extends GeometricShape {

	private double a, b, c;

	void area() {
		double s = (a + b + c) / 2;
		double area1 = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		;
		System.out.println("area of triangle: " + area1);
	}

	void perimeter() {

		double peri = a + b + c;
		System.out.println("Perimeter of Triangle: "+peri);
	}

	//constructor
	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

}
