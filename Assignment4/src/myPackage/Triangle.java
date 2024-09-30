//1.    Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with parameter in its constructor.

package myPackage;

public class Triangle {
    double side1, side2, side3;

    Triangle(double s1, double s2, double s3) {
        side1 = s1; side2 = s2; side3 = s3;
    }

    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    double perimeter() {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area: " + t.area());
        System.out.println("Perimeter: " + t.perimeter());
    }
}
