
/*3.Utilize an abstract class named Animal, featuring abstract methods sound() and move(), to design concrete subclasses such as Dog, Cat, and Bird that inherit from Animal and implement the necessary methods?*/
package Three;

abstract public class Animal {

	abstract void sound();

	abstract void move();
}

class Dog extends Animal {
	public void sound() {
		System.out.println("Dog Barks.");
	}

	public void move() {
		System.out.println("Dog moves.");
	}

}

class Cat extends Animal {
	public void sound() {
		System.out.println("Cat Meow.");
	}

	public void move() {
		System.out.println("cat moves.");
	}

}

class Bird extends Animal {
	public void sound() {
		System.out.println("Bird chirps.");
	}

	public void move() {
		System.out.println("bird fly.");
	}

}