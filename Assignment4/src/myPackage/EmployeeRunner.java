package myPackage;
import java.util.Scanner;
public class EmployeeRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        // Input for salary and hours worked
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter number of hours worked per day: ");
        int hours = sc.nextInt();

        // Get employee info
        emp.getInfo(salary, hours);
        
        // Apply adjustments
        emp.addSal();
        emp.addWork();
        
        // Display final salary
        emp.displaySalary();
        
        sc.close(); // Close the scanner
    }
}
