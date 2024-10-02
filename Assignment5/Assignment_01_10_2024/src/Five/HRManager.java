package Five;

public class HRManager extends Employee {
    public HRManager(double salary) {
        super(salary);
    }

    // Overriding work method
    @Override
    public void work() {
        System.out.println("HR Manager is managing employees.");
    }

    // Method to add employees
    public void addEmployee() {
        System.out.println("Adding a new employee.");
    }

    // Overriding displayInfo method
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent method
        System.out.println("This is an HR Manager.");
    }
}


