package One;

public class Person {
	private final String name;
	private final int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {

		return age;
	}

	public static void main(String[] args) {
		Person person = new Person("vaibhav", 22);
		System.out.println(person.getName());
		System.out.println(person.getAge());

	}

}
