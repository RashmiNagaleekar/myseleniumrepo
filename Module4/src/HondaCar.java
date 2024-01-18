//HondaCar - Child Class
//Car - Parent Class
//HondaCar inherits Car - Inheritance
//is a - relation(HondaCar "is a" Car)
public class HondaCar extends Car{

	
	public HondaCar() {
		System.out.println("Inside Honda Car Default Constructor");
	}
	
	public HondaCar(String name, int fuelCapacity) {
		this.name=name;
		this.fuelCapacity=fuelCapacity;
		System.out.println("Inside Honda Car Overloaded Constructor");

	}
	public void gps() {
		System.out.println("in Honda GPS()");
	}
	
	public void refuel(int quantity, String time) {
		System.out.println("Honda Car Refueling at "+time);
		fuelCapacity=fuelCapacity+quantity;
	}
	
	@Override
	public void refuel() {
		System.out.println("Refusing Honda car "+name);
		fuelCapacity+=20;
		System.out.println("Fuel Capacity is "+fuelCapacity);
	}
}
