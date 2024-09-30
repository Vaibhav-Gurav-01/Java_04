//2.    Print the sum, difference and product of two complex numbers by creating a class, named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user. Use Constructors to initialize the data members.


package myPackage;

import java.util.Scanner;

class Complex {
    double real, imag;

    // Constructor to initialize complex number
    Complex(double r, double i) {
        real = r; 
        imag = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(real + c.real, imag + c.imag);
    }

    // Method to subtract two complex numbers
    Complex subtract(Complex c) {
        return new Complex(real - c.real, imag - c.imag);
    }

    // Method to multiply two complex numbers
    Complex multiply(Complex c) {
        return new Complex(real * c.real - imag * c.imag, real * c.imag + imag * c.real);
    }

    // Method to display complex number
    void display() {
        System.out.print(real + (imag >= 0 ? " + " : " - ") + Math.abs(imag) + "i");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for first complex number
        System.out.print("Enter real and imaginary parts of the first complex number: ");
        Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());
        
        // Input for second complex number
        System.out.print("Enter real and imaginary parts of the second complex number: ");
        Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());
        
        // Calculating and displaying results
        System.out.print("Sum: ");
        c1.add(c2).display();
        System.out.println(); // New line for better output formatting
        
        System.out.print("Difference: ");
        c1.subtract(c2).display();
        System.out.println(); // New line for better output formatting
        
        System.out.print("Product: ");
        c1.multiply(c2).display();
        System.out.println(); // New line for better output formatting
        
        sc.close(); // Close the scanner
    }
}
