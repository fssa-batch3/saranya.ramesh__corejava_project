package day05.solved;

class Engine {

	String capacity;

	public Engine(String capacity) {
		this.capacity = capacity;
	}

	public void printEngineDetails() {
		System.out.println("Engine Capacity: " + this.capacity);
	}
}

/** 
 * Car with just the engine and maker details
 * @author BharathwajSoundarara
 *
 */
class Car {
	Engine engine;
	String maker;

	public Car(String maker, Engine engine) {
		this.engine = engine;
		this.maker = maker;
	}

	public void printCarDetails() {
		System.out.println("Maker: " + maker);
		this.engine.printEngineDetails();
	}
}


