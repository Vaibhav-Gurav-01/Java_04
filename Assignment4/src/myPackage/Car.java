/*5.    Write a program that has variables to store Car data like; CarModel, CarName, CarPrice and CarOwner. The program should include functions to assign user defined values to the above mentioned variable and a
display function to show the values. Write a main that calls these functions. Now write another runner class that declares three Car objects and displays the data of all three*/

package myPackage;
import java.util.Scanner;

class Car {
    String model;
    String name;
    double price;
    String owner;

  
    void setDetails(String model, String name, double price, String owner) {
        this.model = model;
        this.name = name;
        this.price = price;
        this.owner = owner;
    }

    
    void display() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Name: " + name);
        System.out.println("Car Price: $" + price);
        System.out.println("Car Owner: " + owner);
        System.out.println();
    }
}

