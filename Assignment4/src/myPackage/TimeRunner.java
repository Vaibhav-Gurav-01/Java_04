package myPackage;
import java.util.Scanner;

public class TimeRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for time
        System.out.print("Enter hours, minutes, and seconds (separated by space): ");
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        int seconds = sc.nextInt();
        
        // Create Time object using parameterized constructor
        Time time1 = new Time(hours, minutes, seconds);
        
        // Display the time
        time1.display();
        
        // Create Time object using default constructor
        Time time2 = new Time(); // Default time (00:00:00)
        
        // Display default time
        time2.display();
        
        sc.close(); // Close the scanner
    }
}
