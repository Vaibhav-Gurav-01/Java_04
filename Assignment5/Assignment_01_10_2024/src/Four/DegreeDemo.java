package Four;

public class DegreeDemo {
	public static void main(String[] args) {
		// Creating objects of each class
		Degree degree = new Degree();
		Undergraduate undergraduate = new Undergraduate();
		Postgraduate postgraduate = new Postgraduate();

		// Calling the getDegree method for each object
		degree.getDegree(); // Output: I got a degree
		undergraduate.getDegree(); // Output: I am an Undergraduate
		postgraduate.getDegree(); // Output: I am a Postgraduate
	}
}
