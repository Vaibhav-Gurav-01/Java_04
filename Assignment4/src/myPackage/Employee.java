/*
3.    Write a program by creating an 'Employee' class having the following methods and print the final salary.
a.    'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
b.    'AddSal()' which adds $10 to salary of the employee if it is less than $500.
c.    'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours
*/

package myPackage;
import java.util.Scanner;

class Employee {
    double salary;
    int hoursWorked;

    // Method to get employee info
    void getInfo(double salary, int hours) {
        this.salary = salary;
        this.hoursWorked = hours;
    }

    // Method to add salary if it's less than $500
    void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    // Method to add salary if hours worked is more than 6
    void addWork() {
        if (hoursWorked > 6) {
            salary += 5;
        }
    }

    // Method to display final salary
    void displaySalary() {
        System.out.println("Final Salary: $" + salary);
    }
}
