/*3.    Create a class 'Student' with three data members which are name, age and address. The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available". It has two 
Members with the same name 'setInfo'. First method has two
parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint-Use array of objects.*/

package Three;

public class Student {
	private String name;
	private int age;
	private String address;

	// Constructor with default values

	public Student() {
		this.name = "unknown";
		this.age = 0;
		this.address = "not available";
	}

	// First setInfo method (overloaded) for name and age
	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Second setInfo method (overloaded) for name, age, and address
	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	// Method to print student information
	public void printInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}
}
