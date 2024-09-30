package myPackage;
import java.util.Scanner;

class CarRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        Car[] cars = new Car[3];

        for (int i = 0; i < 3; i++) {
            cars[i] = new Car(); 
            System.out.println("Enter details for Car " + (i + 1) + ":");
            System.out.print("Model: ");
            String model = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Owner: ");
            String owner = sc.next();

          
            cars[i].setDetails(model, name, price, owner);
        }

        
        System.out.println("\nCar Details:");
        for (Car car : cars) {
            car.display();
        }
        
        sc.close();
    }
}
