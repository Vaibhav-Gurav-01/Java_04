package Two;

public class MainShape {

	public static void main(String[] args) {
		GeometricShape circle = new Circle(10);

		circle.area();
		circle.perimeter();

		
		System.out.println("------------------");
		GeometricShape triangle = new Triangle(5.2, 3.1, 2.7);
		triangle.area();
		triangle.perimeter();
		
		
		System.out.println("------------------");
		GeometricShape rect = new Rectangle(10.20, 30.20);
		rect.area();
		rect.perimeter();
		

	}

}
