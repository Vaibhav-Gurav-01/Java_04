package Five;

public class Car {
	private Engine engine;

	public Car() {
		this.engine = new Engine();
	}

	public void start() {
		System.out.println("Car is starting...");
		engine.start();
	}

	public void stop() {
		System.out.println("Car is stopping...");
		engine.stop();
	}

	public void engineDetails() {
		engine.display();
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.engineDetails();
		System.out.println("-------------------");

		myCar.start();
		System.out.println("------------------");

		myCar.stop();
	}
}
