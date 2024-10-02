package Three;

public class StudentDemo {

	public static void main(String[] args) {
		// Array of Student objects
		Student[] students = new Student[10];

		// Creating Student objects and setting their information
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(); // Initialize each Student object

			// Example data
			if (i % 2 == 0) {
				students[i].setInfo("Student" + (i + 1), 18 + i); // Using first setInfo method
			} else {
				students[i].setInfo("Student" + (i + 1), 18 + i, "Address" + (i + 1)); // Using second setInfo method
			}
		}

		// Printing student information
		for (Student student : students) {
			student.printInfo();
		}
	}

}
