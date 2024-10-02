package Three;

public class AnimalMain {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.move();
		dog.sound();

		System.out.println("-----------------");
		Animal cat = new Cat();
		cat.move();
		cat.sound();

		System.out.println("-----------------");

		Animal bird = new Bird();
		bird.move();
		bird.sound();

		System.out.println("-----------------");
	}

}
