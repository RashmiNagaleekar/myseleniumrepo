
public class Car {

	String name;
	int fuelCapacity;
	
	//default constructor
	public Car() {
		System.out.println("Inside Default Constructor");
	}
	
	public Car(String n, int c) {
		name=n;
		fuelCapacity=c;
		System.out.println("Inside Overloaded Constructor");
	}
	
	public void start() {
		System.out.println("Car Starting "+name);
	}
	
	public void refuel() {
		System.out.println("Refusing car "+name);
		fuelCapacity+=10;
		System.out.println("Fuel Capacity is "+fuelCapacity);
	}
	
	public void refuel(int quantity) {
		System.out.println("Refusing car "+name);
		fuelCapacity+=quantity;
		System.out.println("Fuel Capacity is "+fuelCapacity);

	}
}
