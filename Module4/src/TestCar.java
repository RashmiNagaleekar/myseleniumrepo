
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  Car c = new Car(); 
		  System.out.println(c.name);
		  System.out.println(c.fuelCapacity); 
		  Car c1 = new Car("A", 200);
		  System.out.println(c1.name); 
		  System.out.println(c1.fuelCapacity); 
		  c1.start();
		  c1.refuel(); 
		  c1.refuel(100);
		 

		  System.out.println("--------Honda Car--------");
		HondaCar h = new HondaCar();
		h.name="H";
		h.fuelCapacity=100;
		h.start();
		h.refuel();
		h.refuel(200);
		h.gps();
		HondaCar h1 = new HondaCar("G",200);
		
		//ref of parent class = object of child class
		//all functions of parent class
		//all overriden functions in child class 
		Car ch = new HondaCar("CH",100);
		ch.start();//called from Car class
		ch.refuel();//classed from Honda Car class
		ch.refuel(100);//called from Car class
		//ch.gps(); cant access this as this is not function of parent class or overriden function in child class
		
		Box b = new Box();
	}

}
