package Five;

public class TestEmployee {

	public static void main(String[] args) {
		// Create an HRManager object
		HRManager hrManager = new HRManager(60000);

		// Call methods
		hrManager.displayInfo(); // Display info about HRManager
		hrManager.work(); // Call overridden work method
		hrManager.addEmployee(); // Call addEmployee method
		System.out.println("Salary: " + hrManager.getSalary()); // Get salary
	}
}
