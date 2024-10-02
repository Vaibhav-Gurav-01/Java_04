package Five;

public class Employee extends Person {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    // Method for work
    public void work() {
        System.out.println("Employee is working.");
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent method
        System.out.println("This is an employee.");
    }
}

